package concot

class Moeda {
    String nome
    String simbolo

        static constraints = {
            nome nullable:false, blank:false, maxSize:64
            /* não pode ser nulo e em branco , com tamanho máximo de 64 caracteres */
            simbolo nullable:false, blank:false, maxSize:4, unique:true
            /* não pode ser nulo e em branco e nem conter repetiçoes com tamanho máximo de 
            4 caracteres. */
        }   
}
