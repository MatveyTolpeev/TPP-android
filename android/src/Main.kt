fun main(args: Array<String>){
    var HeroGenerator = HeroGenerator(4,8)
    val heroes:MutableList<Hero> = HeroGenerator.getGroup()
    for (i in heroes){
        i.printHero()
        println()
    }

}