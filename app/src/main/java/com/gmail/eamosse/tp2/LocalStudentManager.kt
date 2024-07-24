package com.gmail.eamosse.tp2


class LocalStudentManager : StudentManager {
// TODO 1. Implement all methods so that the class is conformed to the interface
    // TODO 2: init the class with a list of 10 students every time a new instance is created;
    // Use the followi

    val etudiants = mutableListOf(
        Student(name = "John1", code = "A1", sexe = "M", address = "Lilles", age = 20),
        Student(name = "John2", code = "A2", sexe = "F", address = "Lilles", age = 30),
        Student(name = "John3", code = "A3", sexe = "F", address = "Lilles", age = 41),
        Student(name = "John4", code = "A4", sexe = "M", address = "Lilles", age = 42),
        Student(name = "John5", code = "A5", sexe = "M", address = "Lilles", age = 34),
        Student(name = "John6", code = "A6", sexe = "F", address = "Lilles", age = 12),
        Student(name = "John7", code = "A7", sexe = "M", address = "Lilles", age = 28),
        Student(name = "John8", code = "A8", sexe = "M", address = "Lilles", age = 16),
        Student(name = "John9", code = "A9", sexe = "F", address = "Lilles", age = 10),
        Student(name = "John10", code = "A10", sexe = "F", address = "Lilles", age = 56),
    )

    override fun listOf10(): List<Student> {
        return this.etudiants
    }

    override fun sortAgeAscDesc(type: String) : List<Student> {
        return when (type.lowercase()) {
            "asc" -> etudiants.sortedBy { it.age }
            "desc" -> etudiants.sortedByDescending { it.age }
            else -> etudiants
        }
    }

    override fun groupBySex(): Map<String, List<Student>> {
        return  etudiants.groupBy { it.sexe }

    }

    override fun boysOrGirls(sexe: String): List<Student> {
        return when (sexe) {
            "F" -> etudiants.filter { it.sexe == "F" }
            "M" -> etudiants.filter { it.sexe == "M" }
            else -> emptyList()
        }
    }

    override fun onlyNames(): List<String> {
       return etudiants.map { it.name }
    }

    override fun deleteBySex(sex: String) {

        etudiants.removeAll { it.sexe == sex }
    }

    override fun reverse(): List<Student> {
        return etudiants.reversed()
    }

    override fun clear() {
        etudiants.clear()
    }

}






