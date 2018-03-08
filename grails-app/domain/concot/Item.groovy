package concot
import concot.*

class Item {
    String nome 
    /* belongsTo : relacionamento um para muitos , Item receberá um novo atributo , categoria do tipo
    Categoria , fechando o relacionamento */ 
    static belongsTo = [categoria:Categoria] 
        //constraints : definir as regras de validação paara cada atributo da nossa classe dominínio
        static constraints = {
            nome nullable:false, blank:false, maxSize:128
            /* nome não pode ser nulo e nem inserir nomes em brancos e repetidos com tamanho máximo
            de 128 caracteres. */
            categoria nullable:false // não pode ser nulo 
        }
        
}
