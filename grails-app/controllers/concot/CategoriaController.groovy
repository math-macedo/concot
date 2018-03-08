package concot

class CategoriaController {
    /* o atributo scaffold recebe como parâmetro a classe Categoria , e o CRUD completo da entidade
    é criado. */
    static scaffold = Categoria 
    def categoria = new Categoria(nome:"Cimento")
}
