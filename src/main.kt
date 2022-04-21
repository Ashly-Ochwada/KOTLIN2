

fun main() {
    var account = CurrentAccount(758862979, "OchwadaWalala", 56000.50)
    account.deposit(100.00)
    account.withdraw(200.50)
    account.details()
    var savings = SavingsAccount(3,758862979,"OchwadaWalala",56000.50)
    savings.withdraw(200.50)

    categorizedproduct(Product("Kleesoft",5,140.50,"Hygiene"))
    categorizedproduct(Product("Tomatoes",6,200.50,"Groceries"))


    var stmt = words("Sugarcane")
    println(stmt)





}

//Create a class CurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the
//amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is
//operated by z
open class CurrentAccount(var accountNumber: Int, var accountName: String, var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
        println(balance)
    }

    open fun withdraw(amount: Double) {
        balance -= amount
        println(balance)

    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variable that is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawals is less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
class SavingsAccount(var withdrawals:Int, accountNumber: Int, accountName: String, balance: Double): CurrentAccount(accountNumber, accountName, balance){
    override fun withdraw(amount: Double) {
        if (withdrawals<4){
            super.withdraw(amount)
            withdrawals++
            println("Can withdraw money")
        }
        else{
            println("Cannot withdraw")
        }

    }
}
//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
data class Product(var name:String,var weight:Int,var price:Double,var category:String)
fun categorizedproduct(product:Product){
    var groceriesList= mutableListOf<Product>()
    var hygieneList= mutableListOf<Product>()
    var otherList= mutableListOf<Product>()
    when(product.category){
        "groceries"->groceriesList.add(product)
        "hygiene"->hygieneList.add(product)
        else->otherList.add(product)
    }
    println(groceriesList)
    println(hygieneList)
    println(otherList)
}

//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”
 fun words(word: String): String{
    var k= word.filterIndexed { index, name -> index%2==0 }
   return k
 }