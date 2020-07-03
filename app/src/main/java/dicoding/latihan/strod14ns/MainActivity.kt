package dicoding.latihan.strod14ns

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var rvPeople: RecyclerView
    private var list: ArrayList<People> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPeople = findViewById(R.id.rv_people)
        rvPeople.setHasFixedSize(true)

        navigation.setOnNavigationItemSelectedListener (onNavigationItemSelectedListener)

        list.addAll(PeopleData.listData)
        showRecyclerList()

    }

    private fun selectedPeople(people: People) {
        Toast.makeText(this, "Kamu memilih " + people.name, Toast.LENGTH_SHORT).show()
        val detailPage = Intent(this@MainActivity, DetailPage::class.java)

        detailPage.putExtra(DetailPage.EXTRA_NAME, people.name)
        detailPage.putExtra(DetailPage.EXTRA_SECONDNAME, people.secondName)
        detailPage.putExtra(DetailPage.EXTRA_DETAIL, people.detail)
        detailPage.putExtra(DetailPage.EXTRA_TANGGAL_LAHIR, people.tanggalLahir)
        detailPage.putExtra(DetailPage.EXTRA_TEMPATLAHIR, people.tempatLahir)
        detailPage.putExtra(DetailPage.EXTRA_INSTITUSI, people.institusi)
        detailPage.putExtra(DetailPage.EXTRA_SATUAN, people.satuan)
        detailPage.putExtra(DetailPage.EXTRA_KESANPESAN, people.kesanDanPesan)
        detailPage.putExtra(DetailPage.EXTRA_IMAGES, people.photo)

        startActivity(detailPage)
    }

    private fun showRecyclerList(){
        rvPeople.layoutManager = LinearLayoutManager(this)
        val listPeopleAdapter = ListViewAdapter(list)
        rvPeople.adapter = listPeopleAdapter

        listPeopleAdapter.setOnItemClickCallback(object : ListViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: People) {
                selectedPeople(data)
            }
        })
    }
    private fun showRecyclerGrid() {
        rvPeople.layoutManager = GridLayoutManager(this, 2)
        val listPeopleAdapter = GridViewAdapter(list)
        rvPeople.adapter = listPeopleAdapter

        listPeopleAdapter.setOnItemClickCallback(object : GridViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: People) {
                selectedPeople(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.action_list -> {
                replaceTittle(getString(R.string.app_name))
                showRecyclerList()

            }

            R.id.action_grid -> {
                replaceTittle(getString(R.string.grid))
                showRecyclerGrid()
            }
            R.id.about_page -> {
                replaceTittle(getString(R.string.about))
                val moveIntent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(moveIntent)
            }

        }
        true
    }



    private fun replaceTittle (title: String){
        supportActionBar?.title = title
    }

}





