import org.test.commonlib.*
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    val service: Service = ServiceImpl()
    println(service.method())

    val date: MyDate = service.typedMethod()
    println(date)
}
