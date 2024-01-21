// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario, nivel: Nivel) {
        inscritos.add(usuario)
        println("Matrícula realizada com sucesso para o usuário ${usuario.nome} no curso de ${nome} com nível $nivel.")
//         TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuario = Usuario("Thiago")
    
    val conteudo = ConteudoEducacional("Kotlin", 1)
    val conteudo1 = ConteudoEducacional("Java", 2)
    val conteudo2 = ConteudoEducacional("Node.JS", 3)
    
    val conteudos = mutableListOf<ConteudoEducacional>()
    
    conteudos.add(conteudo)
    conteudos.add(conteudo1)
    conteudos.add(conteudo2)
    
    val formacao = Formacao("Dev", conteudos)
    formacao.matricular(usuario, Nivel.AVANCADO)
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
