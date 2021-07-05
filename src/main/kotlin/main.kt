fun main(args: Array<String>) {
    println(removeVowels("I LOVE MOBILE DEVELOPMENT COURSE"))
}

    fun removeVowels (s:String):String{
        val remove = StringBuilder()
        for (c in s){
            if (c!= 'A' && c!= 'a'
                && c!= 'E' && c!= 'e'
                && c!= 'I' && c!= 'i'
                && c!= 'O' && c!= 'o'
                && c!= 'U' && c!= 'u'){

                remove.append(c)
            }
        }
        return remove.toString()
}
