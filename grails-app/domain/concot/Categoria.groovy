package concot

class Categoria {
    String nome 
    
        // constraints : definir as regras de validação paara cada atributo da nossa classe dominínio
        static constraints = {
            nome nullable:false, blank:false, maxSize:128, unique:true 
            /* não pode ser nulo , não pode inserir texto em branco e nem repetições , com tamanho máximo do
            campo nome dee 128 caracteres. */ 
        }   
}
