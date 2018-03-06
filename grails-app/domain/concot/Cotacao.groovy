package concot

class Cotacao {
    BigDecimal valor
    Date data
        /* belongsTo : relacionamento um para muitos , cotação receberá novos atributos */
        static belongsTo =
            [item:Item, moeda:Moeda, fornecedor:Fornecedor]

            static constraints = {
            }
}
