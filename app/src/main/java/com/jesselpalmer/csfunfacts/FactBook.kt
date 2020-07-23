package com.jesselpalmer.csfunfacts

import java.util.*

class FactBook {
    private val facts = arrayOf(
        "The First Computer Weighed More Than 27 Tons",
        "About 90% of the World’s Currency Only Exists on Computers",
        "The First Computer Mouse was Made of Wood",
        "About 70% of Virus Engineers Work for Organized Crime Syndicates",
        "People Blink Less When They Use Computers",
        "Hackers Write About 6,000 New Viruses Each Month",
        "The First Gigabyte Drive Cost $40,000",
        "Computers Sort 95% of Mail",
        "A Single Computer Catches 50% of all Wikipedia Vandalism"
    )

    fun getFact() : String {
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(facts.size)
        return facts[randomNumber]
    }
}