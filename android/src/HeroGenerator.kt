import kotlin.random.Random

class HeroGenerator(var minCount: Int, var maxCount: Int) {

    private val randomDigit = (minCount..maxCount).random()

    var firstName: List<String> = listOf("Лысый","Бурый","Злой","Настороженный","Неопознанный","Хитрый")
    var secondName: List<String> = listOf("Маг","Воин","Пёс","Призрак","Страус","Монах")
    private fun randomName(): String {
        var first: Int = Random.nextInt(0,5)
        var second: Int = Random.nextInt(0,5)
        return firstName[first] + " " + secondName[second]
    }

    private fun chooseSpeed(): Int {
        return Random.nextInt(280, 335)
    }

    private fun chooseHp(): Int {
        return Random.nextInt(400,700)
    }

    private fun chooseDef(): Int {
        return Random.nextInt(20, 40)
    }

    fun getGroup(): MutableList<Hero> {
        var heroes: MutableList<Hero> = mutableListOf()
        for (i in 1..randomDigit) {
            heroes.add(Hero(randomName(), chooseHp(), chooseSpeed(), chooseDef(),chooseDef()))

        }
        return heroes

    }
}