(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Você perdeu"))
(defn ganhou [] (print "Você Ganhou!"))

(defn letras-faltantes [palavra acertos]
    (remove (fn [letra] (contains? acertos (str letra))) palavra))

(defn acertou-a-palavra-toda? [palavra acertos]
    (empty? (letras-faltantes palavra acertos)))

(defn le-letra! [] (read-line))

(defn acertou? [chute palavra] (.contains palavra chute))

(defn imprime-forca [vidas palavra acertos]
      (println "Vidas: " vidas)
      (doseq [letra (seq palavra)]
        (if (contains? acertos (str letra))
          (print letra " ")
          (print "_" " ")))
      (println))

(defn jogo [vidas palavra acertos]
    (imprime-forca vidas palavra acertos)
    (cond 
        (= vidas 0) (perdeu)
        (acertou-a-palavra-toda? palavra acertos) (ganhou)
        :else
          (let [chute (le-letra!)]
            (if (acertou? chute palavra)
              (do
                (println "Você Acertou!")
                (recur vidas palavra (conj acertos chute)))
              (do
                (println "Você Errou! Perdeu vida")
                (recur (dec vidas) palavra acertos))))))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))