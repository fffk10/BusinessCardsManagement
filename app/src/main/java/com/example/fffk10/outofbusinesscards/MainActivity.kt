package com.example.fffk10.outofbusinesscards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import java.util.prefs.PreferenceChangeEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        PreferenceManager.getDefaultSharedPreferences(this).apply {
            val company = getString("company", "")
            val postal = getString("company", "")
            val address = getString("company", "")
            val tel = getString("company", "")
            val fax = getString("company", "")
            val email = getString("company", "")
            val url = getString("company", "")
            val name = getString("company", "")
            val position = getString("company", "")

            companyText.text = company
            postalText.text = postal
            addressText.text = address
            telText.text = tel
            faxText.text = fax
            emailText.text = email
            urlText.text = url
            nameText.text = name
            positionText.text = position
        }
    }

    /**
     * Menuボタンを表示する
     * 引数はオプションメニューのインスタンス
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    /**
     * オプションメニューから選択した際に呼び出される
     * 引数には選択したMenu Itemのインスタンスが渡ってくる
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // 選択したオプションを表示
        when (item?.itemId) {
            R.id.edit -> {
                // Kotlinではクラス名::class.javaでクラスのインスタンスを取得
                val intent = Intent(this, EditActivity::class.java)

                // 取得したインスタンスを画面で表示
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}