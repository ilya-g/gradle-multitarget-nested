fun utilityMethod() =
        (1..4).mapTo(mutableListOf()) { it to it.toString() }
//(1..4).asSequence().map { it to it.toString() }.toMap()

fun groupByKeysAndValues() {
    val nameToTeam = listOf("Alice" to "Marketing", "Bob" to "Sales", "Carol" to "Marketing")
    val namesByTeam = nameToTeam.groupBy({ it.second }, { it.first })



    val mutableNamesByTeam = nameToTeam.groupByTo(HashMap(), { it.second }, { it.first })
    // same content as in namesByTeam map, but the map is mutable
    mutableNamesByTeam == namesByTeam
}
