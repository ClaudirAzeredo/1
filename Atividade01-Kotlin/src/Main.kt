fun main() {

        var idade: Int = 25
        var altura: Double = 1.75
        var nome: String = "João"
        var isEstudante: Boolean = true

        var outraIdade: Int = 30
        var somaIdades: Int = outraIdade + idade

        val alturaMultiplicada: Double = altura * 2

        val saudacao: String = "Olá, $nome!"


        println(saudacao)
        println("Nome: $nome")
        println("É estudante? $isEstudante")
        println("Idade: $idade")
        println("Altura: $altura")
        println("Soma das idades: $somaIdades")
        println("Altura multiplicada por 2: $alturaMultiplicada")



}