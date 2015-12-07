Para utilizar a digitação livre de comandos: lein rpl
Utilização de funções, exemplo soma: ->Abertura de função(+<-função 1 <- param 2 <- param)<-fechamento
Para definir uma variavel: (def nome valor) 
Para definir uma função: (defn [arg] (func))
Utilizando o if else: (if (argu)(codigo)(codigo para else))
Utilizando o Do: (do (codigo))
Para criar conjuntos númericos: (def nome [num,num])
Para encontrar números pares: (defn par [x] (= (rem x 2) 1))
Para recarregar os arquivos modificados: (require '[forca.core :as forca] :reload)
Para criar um conjunto: (def nome #{elementos})
Para adicionar elementos em um conjunto (conj nomeconjunto "elemento")
Para retirar elementos em um conjunto (disj nomeconjunto "elemento")
Para criar listas (def nome [elementos])
Para processar listas (map funcao lista)
Para remover elementos de uma lista (remove funcao lista)
Utilizando um if com função de true ou false (if (acertoua-a-palavra-toda?<-utilizado para funções de true ou false palavas acertos))
Para descobrir elementos de uma lista (contains? lista "letra") ou (.contains lista "letra"))
Para ler comandos do teclado (defn le-letra!<- Utilizado em funções que alteram o estado [] (read-line)) 
Para utilizar um if de várias condições (cond (condicao) (codigo) (condicao) (codigo) :else (code))
Para abrir um novo bloco de codigo (let [var var] (codigo))
Para evitar empilhamento de funções que chamam elas mesmas, utilizar recur no lugar do nome da funcao
Para criar um loop (doseq [arg] (seq string/sequencia))
Para reduzir listas a um elemento (reduce (fn [acumulador numerocorente] (+ acc n)) lista)
Para aplicar varias funções de manipulação de lista de uma vez: (->> lista (map (fn [x] (o que faz))) (reduce (acumulador numerocorrente) (funcao)))
Para executar um programa a partir do método main lein run
Para comapctar um programa em .jar lein uberjar