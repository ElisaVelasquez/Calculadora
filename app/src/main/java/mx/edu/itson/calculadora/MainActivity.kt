package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var oper: Int = 0
    var num1F: Double = 0.0
    lateinit var num1: TextView
    lateinit var num2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bRes: Button = findViewById(R.id.bResult)
        val bBor: Button = findViewById(R.id.bBorrar)
        num1 = findViewById(R.id.campo1)
        num2 = findViewById(R.id.campo2)

        bRes.setOnClickListener{
            var num2F = num2.text.toString().toDouble()
            var res = 0.0
            when(oper){
                1-> res = num1F + num2F
                2-> res = num1F- num2F
                3-> res = num1F * num2F
                4-> res = num1F / num2F
            }
            if(oper!=0){
            num2.setText(res.toString())
            num1.setText("")
            oper = 0}
        }

        bBor.setOnClickListener{
            num1.setText("")
            num2.setText("0")
            oper = 0
        }

    }

    fun clicNum(view: View){
        var num2F = num2.text.toString()

        when(view.id){
            R.id.b0 -> num2.setText(num2F+"0")
            R.id.b1 -> num2.setText(num2F+"1")
            R.id.b2 -> num2.setText(num2F+"2")
            R.id.b3 -> num2.setText(num2F+"3")
            R.id.b4 -> num2.setText(num2F+"4")
            R.id.b5 -> num2.setText(num2F+"5")
            R.id.b6 -> num2.setText(num2F+"6")
            R.id.b7 -> num2.setText(num2F+"7")
            R.id.b8 -> num2.setText(num2F+"8")
            R.id.b9 -> num2.setText(num2F+"9")
        }
    }
    fun clicOp(view: View){
        var num2F = num2.text.toString()
        num1F = num2F.toString().toDouble()
        num2.setText("")
        when(view.id){
            R.id.bSum -> {
                num1.setText(num2F+"+")
                oper = 1
            }
            R.id.bRes ->{
                num1.setText(num2F+"-")
                oper = 2
            }
            R.id.bMult ->{
                num1.setText(num2F+"*")
                oper = 3
            }
            R.id.bDiv -> {
                num1.setText(num2F+"/")
                oper = 4
            }
        }

}
}