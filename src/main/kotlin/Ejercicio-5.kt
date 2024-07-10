open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        }
    }

    fun unfold() {
        isFolded = false
    }

    fun fold() {
        isFolded = true
    }
}

fun main() {
    val myPhone = FoldablePhone()
    myPhone.checkPhoneScreenLight()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()

    myPhone.unfold()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight()
}
