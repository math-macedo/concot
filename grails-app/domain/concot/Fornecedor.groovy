package concot

class Fornecedor {
    String Nome

        static constraints = {
            nome nullable:false, blank:false, maxSize:128 , unique:true;
            /* não pode ser nulo e conter nome em branco e nem repetições com no máximo 128 caracteres*/
        }
}
