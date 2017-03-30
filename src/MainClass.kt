import org.jetbrains.annotations.Mutable
import java.security.SecureRandom
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

// For testing
fun main(args : Array<String>) {
    /*
    hello()

    val res = sort(args)
    for (i in 0..res.size-1)
        print(res[i].toString() + " ")

    val res = trian(args[0].toInt())
    for (i in 1..res.size - 1) {
        for (j in 0..res[i].size - 1)
            print(res[i][j].toString() + "\t")
        print("\n")
    }

    list()

    strList()

    println(calculate(toPostfix(args[0])))

    val random = Random()
    var lst = ArrayList<String>()
    for (i in 0..100)
        lst.add(rndstr(random))
    alphabetize(lst)

    println(reduce("aaaabbbbjjfgggggggccc"))

    println(password(80))

    val hello : Hello = Hello()
    val helloWorld : HelloWorld = HelloWorld()
    val helloText : HelloText = HelloText("Kotlin")
    val helloBackwards : HelloBackwards = HelloBackwards("Kotlin")

    hello.hello()
    helloWorld.hello()
    helloText.hello()
    helloBackwards.hello()

    var matr = Array(4, { i -> DoubleArray(4, { j -> 4.0 * i + j })})
    MatrCalc.print(matr)
    //MatrCalc.rotate(matr)
    //MatrCalc.print(matr)
    println(MatrCalc.gaussDet(matr))

    val mlist : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(lst(mlist, 10))
    println(lst(mlist, 6))
    println(lst(mlist, 1))

    isPol("abba")
    isPol("aba")
    isPol("sabbath")

    isSator("SATORAREPOTENETOPERAROTAS")
    isSator("ABCB0BCBA")
    isSator("ABCLOLCBA")
    isSator("Sabbath")

    val list : List<Int> = listOf(1, 2, 3, 2, 2, 4, 6)
    val set : Set<Int> = setOf(1, 2, 4)
    val res = ind(list, set)
    for (elem in res)
    {
        for (el in elem)
            print(el.toString() + "\t")
        println()
    }

    val list0 : List<Int> = listOf(1, 2, 3, 2, 2, 4, 6)
    val set0 : Set<Int> = setOf(1, 2, 7)
    val res0 = ind(list0, set0)
    for (elem in res0)
    {
        for (el in elem)
            print(el.toString() + "\t")
        println()
    }

    println(manualSubString("abcdefg", 2, 5))
    println(manualSubString("abcdefg", 5, 2))
    println(manualSubString("abcdefg", 6, 6))
    println(manualSubString("abcdefg", 6, 7))
    println(autoSubString("abcdefg", 2, 5))

    val set = setOf<Int>(1, 2, 3, 4)
    val res = subSets(set)
    for (subset in res)
    {
        for (elem in subset)
            print(elem.toString() + "\t")
        println()
    }

    val names = listOf("0", "1", "2", "3", "4")
    val matr = listOf(listOf(false, true, true, true, true),
                      listOf(true, false, false, false, false),
                      listOf(true, false, false, false, true),
                      listOf(true, false, false, false, true),
                      listOf(true, false, true, true, false))
    colourize(matr, names)

    println()

    val names2 = listOf("1", "2", "3", "4", "5", "6", "7", "8")
    val matr2 = listOf(listOf(false, true, false, false, false, true, true, true),
                       listOf(true, false, false, false, true, false, true, true),
                       listOf(false, false, false, false, true, true, false, true),
                       listOf(false, false, false, false, true, true, true, false),
                       listOf(false, true, true, true, false, false, false, false),
                       listOf(true, false, true, true, false, false, false, false),
                       listOf(true, true, false, true, false, false, false, false),
                       listOf(true, true, true, false, false, false, false, false))
    colourize(matr2, names2)
*/

    val classes = listOf<List<String>>(
            listOf("Гога", "Марико", "Вано"),
            listOf("Ладо", "Гиви", "Нино", "Софико"),
            listOf("Сосо", "Андро", "Майя")
    )

    val relations = listOf<Pair<String, List<String>>>(
            Pair<String, List<String>>("Гога", listOf("Ладо", "Вано")),
            Pair<String, List<String>>("Марико", listOf("Вано", "Андро")),
            Pair<String, List<String>>("Вано", listOf("Гога", "Майя")),
            Pair<String, List<String>>("Ладо", listOf("Майя", "Сосо")),
            Pair<String, List<String>>("Гиви", listOf("Нино", "Ладо", "Софико")),
            Pair<String, List<String>>("Нино", listOf("Софико", "Марико")),
            Pair<String, List<String>>("Софико", listOf("Гиви", "Андро")),
            Pair<String, List<String>>("Сосо", listOf("Марико", "Вано")),
            Pair<String, List<String>>("Андро", listOf("Сосо", "Майя")),
            Pair<String, List<String>>("Майя", listOf("Гога", "Гиви"))
    )

    split(classes, relations)
}

// CW 1

fun hello() {println("""
ЗАПУСКАЕМ░░
░ГУСЯ░▄▀▀▀▄░ГИДРУ░░
▄███▀░◐░▄▀▀▀▄░░░░░░
░░▄███▀░◐░░░░▌░░░
░░░▐░▄▀▀▀▄░░░▌░░░░
▄███▀░◐░░░▌░░▌░░░░
░░░░▌░░░░░▐▄▄▌░░░░░
░░░░▌░░░░▄▀▒▒▀▀▀▀▄
░░░▐░░░░▐▒▒▒▒▒▒▒▒▀▀▄
░░░▐░░░░▐▄▒▒▒▒▒▒▒▒▒▒▀▄
░░░░▀▄░░░░▀▄▒▒▒▒▒▒▒▒▒▒▀▄
░░░░░░▀▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▀▄
░░░░░░░░░░░▌▌░▌▌░░░░░
░░░░░░░░░░░▌▌░▌▌░░░░░
░░░░░░░░░▄▄▌▌▄▌▌░░░░░
""")}

fun sort(args: Array<String>) : Array<Int> {
    try {
        var res = Array(args.size, { i -> (args[i].toInt()) })
        for (i in 1..res.size-1)
            for (j in i..res.size-1)
                if (res[j-1] > res[j]) {
                    var temp = res[j-1]
                    res[j - 1] = res[j]
                    res[j]=temp
                }
        return res
    }
    catch (e: Exception)
    {
        return Array(0, {i -> i})
    }
    return Array(0, {i -> i})
}

fun trian(n : Int) : Array<Array<Int>>
{
    var arr = Array(n + 1, {i -> Array(n + 1 - i, {j -> 0})})

    for (i in 1..arr.size - 1)
    {
        arr[i][0] = 1
        for (j in 1..n - i)
        {
            arr[i][j] = arr[i][j - 1] + arr[i - 1][j]
        }
    }

    return arr
}

fun rnd(random : Random) : Double
{
    return random.nextInt().toDouble() * random.nextDouble()
}

fun list()
{
    val random = Random()

    val lst = listOf(rnd(random), rnd(random), rnd(random), rnd(random), rnd(random), rnd(random), rnd(random))
    val slst = lst.sorted()
    println("Average: \t" + slst.average())
    println("Median: \t" + slst[(slst.size - 1) / 2])
}

fun rndstr(random: Random) : String
{
    val len = random.nextInt(3) + 2
    val sb = StringBuilder(len);
    for (i in 0..len)
        sb.append("abcdefghijklmnopqrstuvwxyz"[random.nextInt(26)])
    return sb.toString();
}

fun strList()
{
    val random = Random()

    var lst = ArrayList<String>()
    for (i in 0..10000)
        lst.add(rndstr(random))

    println("--- REPEATED ---")

    var i = 0
    while (i < lst.size)
    {
        val word = lst[i]
        if (lst.lastIndexOf(word) > lst.indexOf(word))
        {
            var res = ArrayList<Int>()
            while (lst.lastIndexOf(word) != -1)
            {
                res.add(lst.lastIndexOf(word))
                lst.removeAt(lst.lastIndexOf(word))
            }
            print(word + " \t" + res.size + " repeats:\t")
            for (j in 0..res.size - 1)
                print(" " + res[j])
            print("\n")
        }
        i++
    }

    println("--- UNIQUE ---")

    for (word in lst)
        println(word)
}

fun calculate(str : String) : Double
{
    val queue = str.split(" ")
    val stack = ArrayList<Double>()
    for (elem in queue)
    {
        if (elem == "+")
        {
            val res = stack[0] + stack[1]
            stack.clear()
            stack.add(res)
        }
        else if (elem == "-")
        {
            val res = stack[0] - stack[1]
            stack.clear()
            stack.add(res)
        }
        else if (elem == "*")
        {
            val res = stack[0] * stack[1]
            stack.clear()
            stack.add(res)
        }
        else if (elem == "/")
        {
            val res = stack[0] / stack[1]
            stack.clear()
            stack.add(res)
        }
        else
        {
            stack.add(elem.toDouble())
        }
    }
    return stack[0]
}

fun toPostfix(str : String) : String
{
    var out = ""
    var stack = ArrayList<String>()
    val queue = str.split(" ")

    for (elem in queue)
    {
        if (elem == "+")
        {
            while (stack.isNotEmpty() && stack.last() != "(")
            {
                out += " " + stack.last()
                stack.removeAt(stack.size - 1)
            }
            stack.add(elem)
        }
        else if (elem == "-")
        {
            while (stack.isNotEmpty() && stack.last() != "(")
            {
                out += " " + stack.last()
                stack.removeAt(stack.size - 1)
            }
            stack.add(elem)
        }
        else if (elem == "*")
        {
            while (stack.isNotEmpty() && stack.last() != "(" && stack.last() != "+" && stack.last() != "-")
            {
                out += " " + stack.last()
                stack.removeAt(stack.size - 1)
            }
            stack.add(elem)
        }
        else if (elem == "/")
        {
            while (stack.isNotEmpty() && stack.last() != "(" && stack.last() != "+" && stack.last() != "-")
            {
                out += " " + stack.last()
                stack.removeAt(stack.size - 1)
            }
            stack.add(elem)
        }
        else if (elem == "(")
        {
            stack.add(elem)
        }
        else if (elem == ")")
        {
            while (stack.last() != "(")
            {
                out += " " + stack.last()
                stack.removeAt(stack.size - 1)
            }
            stack.removeAt(stack.size - 1)
        }
        else
        {
            out += " " + elem
        }
    }

    while (stack.isNotEmpty())
    {
        out += " " + stack.last()
        stack.removeAt(stack.size - 1)
    }

    return out.substring(1)
}

// HW 1

fun alphabetize(lst : ArrayList<String>)
{
    var res = Array<ArrayList<String>>(26, {i -> ArrayList<String>()})
    for (word in lst)
        res[word[0].toInt() - 'a'.toInt()].add(word)

    for (i in 0..25)
    {
        println("--- " + ('a' + i) + " ---")
        for (word in res[i])
            println(word)
    }
}

fun reduce(str : String) : String
{
    var temp = '$'
    var count = 0
    var res = ""
    for (ch in str)
        if (ch == temp)
            count++
        else
        {
            if (count > 0)
                res += temp + count.toString()
            temp = ch
            count = 1
        }
    res += temp + count.toString()
    return res
}

fun password(len: Int) : String
{
    var res = ""
    while (res.length < len)
    {
        res += UUID.randomUUID().toString().replace("-", "")
    }
    return res.substring(0, len)
}

// CW 2

open class Hello constructor()
{
    open fun hello()
    {
        println("Hello!")
    }
}

class HelloWorld : Hello()
{
    override fun hello()
    {
        println("Hello World!")
    }
}

open class HelloText constructor(text : String) : Hello()
{
    val text : String = text

    override fun hello()
    {
        println("Hello " + text + "!")
    }
}

class HelloBackwards constructor(text: String) : HelloText(text.reversed())

enum class PaperType
{
    BOOK,
    OFFSET
}

enum class CoverType
{
    HARDBACK,
    SOFTBACK
}

enum class Format
{
    SMALL,
    BIG,
    CYCLOPEAN
}

enum class Genre
{
    DICTIONARY,
    SCIENCE_FICTION,
    FANTASY,
}

enum class Tag
{
    SPACE,
    DRAGONS,
    PROGRAMMING,
    COMMUNISM
}

class Book constructor(title : String,
                       authors : ArrayList<String>,
                       publisher : String,
                       year : Int,
                       city : String,
                       numOfPages : Int,
                       paperType : PaperType,
                       coverType: CoverType,
                       isbn : Int,
                       format: Format,
                       genre : Genre,
                       tags : ArrayList<Tag>)
{
    val title : String = title
    val authors : ArrayList<String> = authors
    val publisher : String = publisher
    val year : Int = year
    val city : String = city
    val numOfPages : Int = numOfPages
    val paperType : PaperType = paperType
    val coverType : CoverType = coverType
    val isbn : Int = isbn
    val format : Format = format
    val genre : Genre = genre
    val tags : ArrayList<Tag> = tags
}

class BookShelf constructor(shelfSize : Format,
                            maxBooks : Int)
{
    val shelfSize : Format = shelfSize
    val maxBooks : Int = maxBooks
    private var books : ArrayList<Book> = ArrayList<Book>()

    fun addBook(book : Book) : Boolean
    {
        if (book.format > shelfSize || books.size >= maxBooks || books.contains(book))
            return false
        books.add(book)
        return true
    }

    fun takeBook(book : Book) : Boolean
    {
        if (books.contains(book))
        {
            books.remove(book)
            return true
        }
        return false
    }
}

class BookCase constructor(shelves : ArrayList<BookShelf>)
{
    var shelves : ArrayList<BookShelf> = shelves
}

interface Calculator
{
    fun calculate(str : String) : Double
}

object BasicCalculator : Calculator
{
    override fun calculate(str : String) : Double
    {
        val queue = str.split(" ")
        val stack = ArrayList<Double>()
        for (elem in queue)
        {
            if (elem == "+")
            {
                val res = stack[0] + stack[1]
                stack.clear()
                stack.add(res)
            }
            else if (elem == "-")
            {
                val res = stack[0] - stack[1]
                stack.clear()
                stack.add(res)
            }
            else if (elem == "*")
            {
                val res = stack[0] * stack[1]
                stack.clear()
                stack.add(res)
            }
            else if (elem == "/")
            {
                val res = stack[0] / stack[1]
                stack.clear()
                stack.add(res)
            }
            else
            {
                stack.add(elem.toDouble())
            }
        }
        return stack[0]
    }
}

object MatrCalc
{
    fun print(matr: Array<DoubleArray>)
    {
        for (i in matr)
        {
            for (j in i)
                print(j.toString() + "\t")
            println()
        }
        println()
    }

    fun transpose(matr : Array<DoubleArray>)
    {
        var temp : Double
        for (i in 0..matr.size-1)
            for (j in 0..i-1)
            {
                temp = matr[i][j]
                matr[i][j] = matr[j][i]
                matr[j][i] = temp
            }
    }

    fun flip(matr: Array<DoubleArray>)
    {
        var temp : Double
        for (i in 0..matr.size-1)
            for (j in 0..(matr.size-1)/2)
            {
                temp = matr[i][j]
                matr[i][j] = matr[i][matr.size-1-j]
                matr[i][matr.size-1-j] = temp
            }
    }

    fun rotate(matr: Array<DoubleArray>)
    {
        transpose(matr)
        flip(matr)
    }

    fun gaussDet(matr: Array<DoubleArray>) : Double
    {
        var res : Double = 1.0

        for (i in 0..matr.size)
        {
            for (j in 0..matr.size)
            {
                if (matr[i][i] == 0.0)
                    return 0.0

                val b : Double = matr[j][i] / matr[i][i]

                for (k in 0..matr.size)
                    matr[j][k] = matr[j][k] - b * matr[i][k]
            }

            res *= matr[i][i]
        }

        return res
    }
}

// HW 3

fun lst(list : MutableList<Int>, n : Int) : Double
{
    fun shuffle(list : MutableList<Int>) : MutableList<Int>
    {
        val random : Random = SecureRandom()

        for (i in 0..list.size-1)
        {
            val pos = random.nextInt(list.size)
            val tmp : Int = list[i]
            list[i] = list[pos]
            list[pos] = tmp
        }
        return list
    }

    if (n >= list.size)
        return list.average()

    val random : Random = SecureRandom()
    val pos : List<Int> = List(n, {e -> random.nextInt(list.size)})

    return List(n, {t -> List(n, {i -> shuffle(list)[pos[i]]}).average()}).average()
}

fun isPol(str: String)
{
    if (str.equals(str.reversed()))
        println("Yes")
    else
        println("No")
}

fun isSator(str: String)
{
    if (Math.sqrt(str.length.toDouble()) != Math.sqrt(str.length.toDouble()).toInt().toDouble())
    {
        println("No")
        return
    }

    val side : Int = Math.sqrt(str.length.toDouble()).toInt()
    val sqr = List<String>(side, {i -> str.substring(i*side, (i+1)*side)})
    for (i in 0..(side - 1) / 2)
    {
        for (j in 0..(side - 1) / 2)
            if (sqr[i][j] != sqr[side - 1 - i][side - 1 - j] || sqr[i][j] != sqr[j][i])
            {
                println("No")
                return
            }
    }
    println("Yes")
}

fun ind(list: List<Int>, set: Set<Int>) : List<MutableList<Int>>
{
    return List<MutableList<Int>>(set.size, {s ->
            val lst = MutableList<Int>(0, {i -> -1})
            for (i in 0..list.size - 1)
                if (list[i] == set.elementAt(s))
                    lst.add(i)
            lst
    })
}

fun manualSubString(str: String, a : Int, b : Int) : String
{
    if (a >= str.length || b >= str.length || a > b)
        return ""
    var res = ""
    for (i in a..b)
        res += str[i]
    return res
}

fun autoSubString(str: String, a : Int, b : Int) : String
{
    if (a >= str.length || b >= str.length || a > b)
        return ""
    return str.substring(a, b + 1)
}

fun <T>subSets(set : Set<T>) : MutableSet<MutableSet<T>>
{
    fun binary(num : Int, len : Int) : String
    {
        var str = ""
        var temp = num
        while (temp != 0)
        {
            str += temp % 2
            temp /= 2
        }
        while (str.length < len)
            str += '0'
        return str.reversed()
    }

    val size = Math.pow(2.0, set.size.toDouble()).toInt()
    var res : MutableSet<MutableSet<T>> = mutableSetOf()
    for (i in 0..size - 1)
    {
        val bin = binary(i, set.size)
        var temp : MutableSet<T> = mutableSetOf()
        for (j in 0..bin.length - 1)
        {
            if (bin[j] == '1')
                temp.add(set.elementAt(j))
        }
        res.add(temp)
    }
    return res
}

// input: adjacency matrix, node names
fun colourize(matr : List<List<Boolean>>, names : List<String>, print : Boolean = true) : HashMap<String, Int>
{
    var colours = HashMap<String, Int>()

    if (matr.size != names.size)
    {
        println("Invalid data!")
        return colours
    }

    for (elem in matr)
        if (elem.size != names.size)
        {
            println("Invalid data!")
            return colours
        }

    var degrees = MutableList(names.size, {i -> Pair<String, Int>(names[i], matr[i].sumBy { elem -> if (elem) 1 else 0 })})

    degrees.sortWith(kotlin.Comparator { o1, o2 -> if (o1.second < o2.second) 1 else -1 })

    fun getColours(degrees : MutableList<Pair<String, Int>>)
    {
        colours.clear()

        fun checkNear(name1 : String, name2: String) : Boolean
        {
            return matr[names.indexOf(name1)][names.indexOf(name2)]
        }

        var i = 0

        while(colours.size < names.size)
        {
            for (node in degrees)
            {
                var checkPassed = true

                if (colours.contains(node.first))
                    checkPassed = false

                for (name in names)
                    if (checkNear(node.first, name) && colours.contains(name) && colours[name] == i)
                        checkPassed = false

                if (checkPassed)
                    colours[node.first] = i
            }

            i++
        }

        if (print)
        {
            println("Number of colours: " + i.toString())
            for (name in names)
                println("\"" + name + "\"\t" + colours[name].toString())
        }
    }

    if (print)
        println("--- GREEDY ---")
    getColours(degrees)

    var groupSize = HashMap<String, Int>()

    for (name in names)
    {
        val colour = colours[name]
        var count = 0

        for (elem in colours)
            if (elem.value == colour)
                count++

        groupSize[name] = count
    }

    val newDegrees = MutableList(names.size, {i -> Pair<String, Int>(names[i], groupSize[names[i]]!!)}).sortedWith(kotlin.Comparator { o1, o2 -> if (o1.second > o2.second) 1 else -1 }).toMutableList()

    if (print)
        println("--- BETTER ---")
    getColours(newDegrees)

    return colours
}

// splits into perfect classes first, then merges the smallest classes until there number of classes is equal or less than original
fun split(classes : List<List<String>>, relations: List<Pair<String, List<String>>>) : HashMap<String, Int>
{
    val maxClasses = classes.size

    var mNames = mutableListOf<String>()
    for (cls in classes)
        for (name in cls)
            mNames.add(name)
    val names = mNames.toList()

    var mMatr = MutableList<MutableList<Boolean>>(names.size, {i -> MutableList(names.size, {j -> false})})
    for (relation in relations)
        for (name in relation.second)
        {
            mMatr[names.indexOf(name)][names.indexOf(relation.first)] = true
            mMatr[names.indexOf(relation.first)][names.indexOf(name)] = true
        }
    val matr = List<List<Boolean>>(names.size, {i -> mMatr[i].toList()})

    var colours = colourize(matr, names, false)

    var currClasses = -1
    for (elem in colours)
        if (elem.value > currClasses)
            currClasses = elem.value
    currClasses++

    if (currClasses <= maxClasses)
    {
        for (name in names)
            println("\"" + name + "\"\t" + colours[name].toString())
        return colours
    }

    while (maxClasses < currClasses)
    {
        var groupSize = HashMap<String, Int>()

        for (name in names)
        {
            val colour = colours[name]
            var count = 0

            for (elem in colours)
                if (elem.value == colour)
                    count++

            groupSize[name] = count
        }

        val sorted = MutableList(names.size, {i -> Pair<String, Int>(names[i], groupSize[names[i]]!!)}).sortedWith(kotlin.Comparator { o1, o2 -> if (o1.second > o2.second) 1 else -1 }).toMutableList()

        val class1 = colours[sorted[0].first]
        var class2 = 1
        while (colours[sorted[class2].first] == class1)
            class2++

        for (elem in colours)
            if (elem.value == class2)
                elem.setValue(class1!!)

        currClasses--
    }

    for (name in names)
        println("\"" + name + "\"\t" + colours[name].toString())
    return colours
}