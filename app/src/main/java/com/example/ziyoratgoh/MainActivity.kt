package com.example.ziyoratgoh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    private fun ulugbek() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Ulugbek")
        startActivity(intent)
    }

    private fun imom_albuxoriy() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Imom_Albuxoriy")
        startActivity(intent)
    }

    private fun xazrati_donyor() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Xazrati_Donyor")
        startActivity(intent)
    }

    private fun bibixonim() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Bibixonim")
        startActivity(intent)
    }

    private fun gori_amir() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Gori_Amir")
        startActivity(intent)
    }

    private fun shoxizinda() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Shoxizinda")
        startActivity(intent)
    }

    private fun registon() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Registon")
        startActivity(intent)
    }
    fun Clic(view: android.view.View) {

        if (view.id == 2131230818)
            registon()
        else if (view.id == 2131230838)
            shoxizinda()
        else if (view.id == 2131230846)
            gori_amir()
        else if (view.id == 2131230854)
            bibixonim()
        else if (view.id == 2131230862)
            xazrati_donyor()
        else if (view.id == 2131230868)
            imom_albuxoriy()
        else if (view.id == 2131230875)
            ulugbek()
        else if (view.id == 2131230839)
            zangota()
        else if (view.id == 2131230840)
            qizilmozor()
        else if (view.id == 2131230841)
            xazratiali()
        else if (view.id == 2131230842)
            parpiota()
        else if (view.id == 2131230843)
            qirqiz()
        else if (view.id == 2131230844)
            zarkent()
        else if (view.id == 2131230845)
            anbar_bibi()
        else if (view.id == 2131230847 )
            poikalon()
        else if (view.id == 2131230848)
            arkqala()
        else if (view.id == 2131230849)
            somoniylar()
        else if (view.id == 2131230850 )
            chashmaiAyub()
        else if (view.id == 2131230851)
            magakiAtari()
        else if (view.id == 2131230852)
            mirzoulugbek()
        else if (view.id == 2131230855 )
            ichanqala()
        else if (view.id == 2131230856 )
            amirxon_madrasasi()
        else if (view.id == 2131230857 )
            pahlavon_mahmud()
        else if (view.id == 2131230858 )
            nurulloboy_saroyi()
        else if (view.id == 2131230859 )
            yoshlar_koli()
        else if (view.id == 2131230860 )
            sulaymon_qala()//
        else if (view.id == 2131230861 )
            avesto()
        else if (view.id == 2131230863 )
            Alhakim()
        else if (view.id == 2131230864 )
            SultonSaodat()
        else if (view.id == 2131230865 )
            Termiziy_maqbarasi()
        else if (view.id == 2131230866 )
            FayozTepa()
        else if (view.id == 2131230867 )
            QirqizQalasi()
        else if (view.id == 2131230869 )
            MingTeapa()
        else if (view.id == 2131230870 )
            ImomOta()
        else if (view.id == 2131230871 )
            Xonabod()
        else if (view.id == 2131230872 )
            JomeMemori()
        else if (view.id == 2131230873 )
            QutaybaibnMuslim()
        else if (view.id == 2131230874 )
            QadimiyQala()
        else if (view.id == 2131230876 )
            Margilon()
        else if (view.id == 2131230877 )
            Qoqon()
        else if (view.id == 2131230878 )
            Xudoyarxon_saroyi()
        else if (view.id == 2131230879 )
            Modarixon()
        else if (view.id == 2131230880 )
            Quva()
        else if (view.id == 2131230881 )
            Shohimardon()
        else if (view.id == 2131230882 )
            AxtamSaxoba()
        else if (view.id == 2131230883 )
            DevonaBuva()
        else if (view.id == 2131230884 )
            BibiNaima()///
        else if (view.id == 2131231261 )
            MirSaidBahrom()
        else if (view.id == 2131231262 )
            QosimShayx()
        else if (view.id == 2131231263 )
            Chashma()
        else if (view.id == 2131230819 )
            Zomin()
        else if (view.id == 2131230820 )
            Nurota()
        else if (view.id == 2131230821 )
            Majrumning()
        else if (view.id == 2131230822 )
            ParpiOyim()
        else if (view.id == 2131230823 )
            SaidIbnVaqqos()
        else if (view.id == 2131230824 )
            TemirDarvoza()
        else if (view.id == 2131230825 )
            Oqsaroy()
        else if (view.id == 2131230826 )
            LangarOta()
        else if (view.id == 2131230827 )
            TemurGori()
        else if (view.id == 2131230828 )
            SuvTushar()
        else if (view.id == 2131230829 )
            TohirZuhra()
        else if (view.id == 2131230830 )
            Lochin()
        else if (view.id == 2131230831 )
            ChardjauAbdirev()
        else if (view.id == 2131230832 )
            BeshTubaTepaligi()
        else if (view.id == 2131230833 )
            XakimOta()
        else if (view.id == 2131230834 )
            MadaminXan()
        else if (view.id == 2131230835 )
            Qirqizqala()
        else if (view.id == 2131230836 )
            Urgaqala()
        else if (view.id == 2131230837 )
            Angkaqala()
        else if (view.id == 2131230853 )
            mirarab()



    }

    private fun Angkaqala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Angkaqala")
        startActivity(intent)
    }

    private fun Urgaqala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Urgaqala")
        startActivity(intent)
    }

    private fun Qirqizqala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Qirqizqala")
        startActivity(intent)
    }

    private fun MadaminXan() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","MadaminXan")
        startActivity(intent)
    }

    private fun XakimOta() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","XakimOta")
        startActivity(intent)
    }

    private fun BeshTubaTepaligi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","BeshTubaTepaligi")
        startActivity(intent)
    }

    private fun ChardjauAbdirev() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ChardjauAbdirev")
        startActivity(intent)
    }
///
    private fun Lochin() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Lochin")
        startActivity(intent)
    }

    private fun TohirZuhra() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","TohirZuhra")
        startActivity(intent)
    }

    private fun SuvTushar() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","SuvTushar")
        startActivity(intent)
    }

    private fun TemurGori() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","TemurGori")
        startActivity(intent)
    }

    private fun LangarOta() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","LangarOta")
        startActivity(intent)
    }

    private fun Oqsaroy() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Oqsaroy")
        startActivity(intent)
    }

    private fun TemirDarvoza() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","TemirDarvoza")
        startActivity(intent)
    }

    private fun SaidIbnVaqqos() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","SaidIbnVaqqos")
        startActivity(intent)
    }

    private fun ParpiOyim() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ParpiOta")
        startActivity(intent)
    }

    private fun Majrumning() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Majrumning")
        startActivity(intent)
    }

    private fun Nurota() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Nurota")
        startActivity(intent)
    }

    private fun Zomin() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Zomin")
        startActivity(intent)
    }
/////
    private fun Chashma() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Chashma")
        startActivity(intent)
    }

    private fun QosimShayx() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","QosimShayx")
        startActivity(intent)
    }

    private fun MirSaidBahrom() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","MirSaidBahrom")
        startActivity(intent)
    }

    private fun BibiNaima() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","BibiNaima")
        startActivity(intent)
    }

    private fun DevonaBuva() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","DevonaBuva")
        startActivity(intent)
    }

    private fun AxtamSaxoba() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","AxtamSaxoba")
        startActivity(intent)
    }
////
    private fun Shohimardon() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Shohimardon")
        startActivity(intent)
    }

    private fun Quva() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Quva")
        startActivity(intent)
    }

    private fun Modarixon() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Modarixon")
        startActivity(intent)
    }

    private fun Xudoyarxon_saroyi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Xudoyarxon")
        startActivity(intent)
    }

    private fun Qoqon() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Qoqon")
        startActivity(intent)
    }

    private fun Margilon() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Margilon")
        startActivity(intent)
    }
//Fargona
    private fun QadimiyQala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","QadimiyQala")
        startActivity(intent)
    }

    private fun QutaybaibnMuslim() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","QutaybaibnMuslim")
        startActivity(intent)
    }

    private fun JomeMemori() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","JomeMemori")
        startActivity(intent)
    }

    private fun Xonabod() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Xonabod")
        startActivity(intent)
    }

    private fun ImomOta() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ImomOta")
        startActivity(intent)
    }

    private fun MingTeapa() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Mingtepa")
        startActivity(intent)
    }
//andijon tepa
    private fun QirqizQalasi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","QirqizQalasi")
        startActivity(intent)
    }

    private fun FayozTepa() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","FazyozTepa")
        startActivity(intent)
    }

    private fun Termiziy_maqbarasi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Termiziy_maqbarasi")
        startActivity(intent)
    }

    private fun SultonSaodat() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","SultonSaodat")
        startActivity(intent)
    }

    private fun Alhakim() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Alhakim")
        startActivity(intent)
    }

    private fun avesto() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Avesto")
        startActivity(intent)
    }

    private fun sulaymon_qala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Sulaymon_qala")
        startActivity(intent)
    }

    private fun yoshlar_koli() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Yoshlar_koli")
        startActivity(intent)
    }

    private fun nurulloboy_saroyi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Nurulloboy_saroyi")
        startActivity(intent)
    }

    private fun pahlavon_mahmud() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Pahlavon_mahmud")
        startActivity(intent)
    }

    private fun amirxon_madrasasi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Amirxon_madrasasi")
        startActivity(intent)
    }

    private fun ichanqala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Ichanqala")
        startActivity(intent)
    }

    private fun mirarab() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Mirarab")
        startActivity(intent)
    }

    private fun mirzoulugbek() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","MirzoUlugbek")
        startActivity(intent)
    }

    private fun magakiAtari() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","MagakkiAtari")
        startActivity(intent)
    }

    private fun chashmaiAyub() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ChashmaiAyub")
        startActivity(intent)
    }

    private fun somoniylar() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Somoniylar")
        startActivity(intent)
    }

    private fun arkqala() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ArkQala")
        startActivity(intent)
    }

    private fun poikalon() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","PoiKalon")
        startActivity(intent)
    }

    private fun anbar_bibi() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","AnbarBibi")
        startActivity(intent)
    }

    private fun zangota() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ZangOta")
        startActivity(intent)
    }

    private fun zarkent() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Zarkent")
        startActivity(intent)
    }

    private fun qirqiz() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","Qirqiz")
        startActivity(intent)
    }

    private fun parpiota() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","ParpiOta")
        startActivity(intent)
    }

    private fun xazratiali() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","XazratiAli")
        startActivity(intent)
    }

    private fun qizilmozor() {
        val intent = Intent(this,Malumot::class.java)
        intent.putExtra("Name","QizilMozor")
        startActivity(intent)
    }


}