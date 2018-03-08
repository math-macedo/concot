package concot

class Categoria {
    String nome 

    static hasMany = [itens:Item] // tornando bidirecional o relacionamento com a classe Item 
    
    // modificando o modo como a representação textual é gerada
    String toString() {
        this.nome
    }
        // constraints : definir as regras de validação paara cada atributo da nossa classe dominínio
        static constraints = {
            nome nullable:false, blank:false, maxSize:128, unique:true 
            /* não pode ser nulo , não pode inserir texto em branco e nem repetições , com tamanho máximo do
            campo nome dee 128 caracteres. */ 
        }
}
