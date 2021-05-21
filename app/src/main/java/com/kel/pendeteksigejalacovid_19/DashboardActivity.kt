package com.kel.pendeteksigejalacovid_19

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val inNama: EditText? = findViewById(R.id.NamaEdit)
        val inUmur: EditText? = findViewById(R.id.UmurEdit)

        val inSuhu: Spinner? = findViewById(R.id.spinner)

        val cbPert1: CheckBox? = findViewById(R.id.checkBox1)
        val cbPert2: CheckBox? = findViewById(R.id.checkBox2)
        val cbPert4: CheckBox? = findViewById(R.id.checkBox4)
        val cbPert5: CheckBox? = findViewById(R.id.checkBox5)
        val cbPert6: CheckBox? = findViewById(R.id.checkBox6)
        val cbPert7: CheckBox? = findViewById(R.id.checkBox7)
        val cbPert8: CheckBox? = findViewById(R.id.checkBox8)
        val cbPert9: CheckBox? = findViewById(R.id.checkBox9)

        val btSubmit: CardView? = findViewById(R.id.btnSubmit)

        val namaUser: TextView? = findViewById(R.id.textView1)
        val umurUser: TextView? = findViewById(R.id.textView2)
        val hasilDeteksi: TextView? = findViewById(R.id.textView3)
        val hasilRekomendasi: TextView? = findViewById(R.id.textView4)
        val hasilSuhu: TextView? = findViewById(R.id.textView5)

        btSubmit?.setOnClickListener {
            val stringNama: String = inNama?.text.toString()
            val stringUmur: String = inUmur?.text.toString()

            val textSuhu: String = inSuhu?.selectedItem.toString()

            var hsl = ""
            var hslRekom = ""

            if (!(!cbPert1?.isChecked!! || !cbPert2?.isChecked!! || !cbPert4?.isChecked!! || !cbPert5?.isChecked!! || !cbPert6?.isChecked!! || !cbPert7?.isChecked!! || !cbPert8?.isChecked!! || !cbPert9?.isChecked!!)) {
                hsl += getString(R.string.terdeteksi)
                hslRekom += getString(R.string.rekomTerdeteksi)
            } else {
                hsl += getString(R.string.tdkTerdeteksi)
                hslRekom += getString(R.string.rekomTdkTerdeteksi)
            }

            namaUser?.text = "" + stringNama
            umurUser?.text = "$stringUmur Tahun"
            hasilDeteksi?.text = "" + hsl
            hasilRekomendasi?.text = "" + hslRekom
            hasilSuhu?.text = "" +textSuhu
        }
    }
}