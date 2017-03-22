import java.util.*
import kotlin.collections.ArrayList

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
    */

    var matr = Array(4, { i -> DoubleArray(4, { j -> 4.0 * i + j })})
    MatrCalc.print(matr)
    //MatrCalc.rotate(matr)
    //MatrCalc.print(matr)
    println(MatrCalc.gaussDet(matr))
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

