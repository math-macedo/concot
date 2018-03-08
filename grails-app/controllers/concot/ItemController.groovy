package concot
import concot.*

class ItemController {

    static scaffold = Item

    def index() {
        def categoria1 = new Categoria(nome:"Parafuso")  // criando uma nova categoria com nome parafuso
        /* usamos para inserir elementos dentro de um dos atributos definido no hasMany */
        categoria1.addToItens(new Item(nome:"Sem porca"))
        categoria1.addToItens(new Item(nome:"Com porca"))
        categoria1.save() // persiste os dados no banco de dados 

        def categoria2 = new Categoria(nome:"Materiais")// cirando uma nova categoria com nome materiais
        /* usamos para inserie elementos dentro de um dos atributos definido no hasMany*/
        categoria2.addToItens(new Item(nome:"Cimento"))
        categoria2.addToItens(new Item(nome:"Argamassa"))
        categoria2.addToItens(new Item(nome:"Brita"))
        categoria2.save() //voilá! 
    }
}
