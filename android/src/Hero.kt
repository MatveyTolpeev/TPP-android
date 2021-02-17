class Hero (var name: String, var maxHp: Int, var speed: Int, var magicDef: Int, var physDef: Int){
    fun printHero(){
        println("Имя: " + name + "\n" +
                "Максимальное хп: " + maxHp + "\n" +
                "Скорость: " + speed + "\n" +
                "Магическое сопротивление: " + magicDef + "\n" +
                "Физическое сопротивление: " + physDef)
    }

    override fun toString(): String {
        val heroToString = "Имя: " + name + "\n" +
                "Максимальное хп: " + maxHp + "\n" +
                "Скорость: " + speed + "\n" +
                "Магическое сопротивление: " + magicDef + "\n" +
                "Физическое сопротивление: " + physDef
        return heroToString
    }
}