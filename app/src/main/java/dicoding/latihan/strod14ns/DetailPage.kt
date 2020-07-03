package dicoding.latihan.strod14ns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import android.support.*

class DetailPage: AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_SECONDNAME = "extra_secondname"
        const val EXTRA_DETAIL = "extra_age"
        const val EXTRA_TANGGAL_LAHIR = "extra_tanggal_lahir"
        const val EXTRA_TEMPATLAHIR = "extra_tempat_lahir"
        const val EXTRA_INSTITUSI = "extra_institusi"
        const val EXTRA_SATUAN = "extra_satuan"
        const val EXTRA_KESANPESAN = "extra_kesanpesan"
        const val EXTRA_IMAGES = "extra_images"
    }

    private lateinit var setOnItemClickListener: ExpandableListView.OnChildClickListener

    fun setOnItemClickListener(setOnItemClickListener: ExpandableListView.OnChildClickListener) {
        this.setOnItemClickListener = setOnItemClickListener
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)



        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val namaPanggilan: TextView = findViewById(R.id.nama_panggilan)
        val detailPeopleData: TextView = findViewById(R.id.detail_people_data)
        val tempatLahir: TextView = findViewById(R.id.tempat_lahir)
        val tanggallahir: TextView = findViewById(R.id.tanggal_lahir)
        val institusi: TextView = findViewById(R.id.institusi)
        val satuan: TextView = findViewById(R.id.satuan)
        val kesanPesan: TextView = findViewById(R.id.kesan_pesan)
        val peopleImages: ImageView = findViewById(R.id.people_images)

        val name = intent.getStringExtra(EXTRA_NAME)
        val secondName = intent.getStringExtra(EXTRA_SECONDNAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val lahirTempat = intent.getStringExtra(EXTRA_TEMPATLAHIR)
        val lahirTanggal = intent.getStringExtra(EXTRA_TANGGAL_LAHIR)
        val universitas = intent.getStringExtra(EXTRA_INSTITUSI)
        val jurusan = intent.getStringExtra(EXTRA_SATUAN)
        val pesanKesan = intent.getStringExtra(EXTRA_KESANPESAN)
        val images = intent.getIntExtra(EXTRA_IMAGES, 0)



        val textName = name
        val textSecondName = secondName
        val textDetail = detail
        val textTempatLahir = lahirTempat
        val textTanggalLahir = lahirTanggal
        val textInstitusi = universitas
        val textSatuan = jurusan
        val textPesanKesan = pesanKesan
        val circlePeopleImage = images


        tvDataReceived.text = textName
        namaPanggilan.text = textSecondName
        detailPeopleData.text = textDetail
        tempatLahir.text = textTempatLahir
        tanggallahir.text = textTanggalLahir
        institusi.text = textInstitusi
        satuan.text = textSatuan
        kesanPesan.text = textPesanKesan
        peopleImages.imageAlpha = circlePeopleImage

        Glide.with(this)
            .load(images)
            .centerCrop()
            .into(peopleImages)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }




}
