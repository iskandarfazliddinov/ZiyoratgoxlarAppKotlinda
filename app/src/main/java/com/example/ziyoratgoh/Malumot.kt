package com.example.ziyoratgoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_malumot.*

class Malumot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_malumot)

        val intent = intent

        if (intent.getStringExtra("Name") == "Ulugbek") {
            img_malumot_1.setImageResource(R.drawable.ulugbek)
            img_malumot_2.setImageResource(R.drawable.ulugbek)
            text_malumot.text = getString(R.string.ulugbek)

        } else if (intent.getStringExtra("Name") == "Registon") {
            img_malumot_1.setImageResource(R.drawable.registon)
            img_malumot_2.setImageResource(R.drawable.registon)
            text_malumot.text = getString(R.string.text_1)

        } else if (intent.getStringExtra("Name") == "Shoxizinda") {
            img_malumot_1.setImageResource(R.drawable.shaxizinda)
            img_malumot_2.setImageResource(R.drawable.shaxizinda)
            text_malumot.text = getString(R.string.Shaxizinda)
        } else if (intent.getStringExtra("Name") == "Gori_Amir") {
            img_malumot_1.setImageResource(R.drawable.amir_maqbarasi)
            img_malumot_2.setImageResource(R.drawable.amir_maqbarasi)
            text_malumot.text = getString(R.string.Amir)
        } else if (intent.getStringExtra("Name") == "Bibixonim") {
            img_malumot_1.setImageResource(R.drawable.bibixonim)
            img_malumot_2.setImageResource(R.drawable.bibixonim)
            text_malumot.text = getString(R.string.bibixonim)
        } else if (intent.getStringExtra("Name") == "Xazrati_Donyor") {
            img_malumot_1.setImageResource(R.drawable.xazrati_donyor)
            img_malumot_2.setImageResource(R.drawable.xazrati_donyor)
            text_malumot.text = getString(R.string.XazratiDoniyor)
        } else if (intent.getStringExtra("Name") == "Imom_Albuxoriy") {
            img_malumot_1.setImageResource(R.drawable.albuxoriy)
            img_malumot_2.setImageResource(R.drawable.albuxoriy)
            text_malumot.text = getString(R.string.albuxoriy)

        } else if (intent.getStringExtra("Name") == "AnbarBibi") {
            img_malumot_1.setImageResource(R.drawable.anbar_bibi)
            img_malumot_2.setImageResource(R.drawable.anbar_bibi)
            text_malumot.text = getString(R.string.anbarbibi)

        } else if (intent.getStringExtra("Name") == "ZangOta") {
            img_malumot_1.setImageResource(R.drawable.zang_ota)
            img_malumot_2.setImageResource(R.drawable.zang_ota)
            text_malumot.text = getString(R.string.zang_ota)
        }else if (intent.getStringExtra("Name") == "Zarkent") {
            img_malumot_1.setImageResource(R.drawable.zarkent)
            img_malumot_2.setImageResource(R.drawable.zarkent)
            text_malumot.text = getString(R.string.zarkent)
        }else if (intent.getStringExtra("Name") == "Qirqiz") {
            img_malumot_1.setImageResource(R.drawable.qirq_qiz)
            img_malumot_2.setImageResource(R.drawable.qirq_qiz)
            text_malumot.text = getString(R.string.qirq_qiz)
        }else if (intent.getStringExtra("Name") == "ParpiOta") {
            img_malumot_1.setImageResource(R.drawable.parpi_ota)
            img_malumot_2.setImageResource(R.drawable.parpi_ota)
            text_malumot.text = getString(R.string.parpi_ota)
        }
        else if (intent.getStringExtra("Name") == "XazratiAli") {
            img_malumot_1.setImageResource(R.drawable.xazrati_ali_buva)
            img_malumot_2.setImageResource(R.drawable.xazrati_ali_buva)
            text_malumot.text = getString(R.string.xazrati_ali_buva)
        }
        else if (intent.getStringExtra("Name") == "QizilMozor") {
            img_malumot_1.setImageResource(R.drawable.qizil_mozor)
            img_malumot_2.setImageResource(R.drawable.qizil_mozor)
            text_malumot.text = getString(R.string.qizil_mozor)
        }
        else if (intent.getStringExtra("Name") == "Mirarab") {
            img_malumot_1.setImageResource(R.drawable.mir)
            img_malumot_2.setImageResource(R.drawable.mir)
            text_malumot.text = getString(R.string.mir)
        }
        else if (intent.getStringExtra("Name") == "MirzoUlugbek") {
            img_malumot_1.setImageResource(R.drawable.mirzo_ulugbek)
            img_malumot_2.setImageResource(R.drawable.mirzo_ulugbek)
            text_malumot.text = getString(R.string.mirzo_ulugbek)
        }
        else if (intent.getStringExtra("Name") == "MagakkiAtari") {
            img_malumot_1.setImageResource(R.drawable.magaki_attari)
            img_malumot_2.setImageResource(R.drawable.magaki_attari)
            text_malumot.text = getString(R.string.magaki_attari)
        }
        else if (intent.getStringExtra("Name") == "ChashmaiAyub") {
            img_malumot_1.setImageResource(R.drawable.chashma_ayub)
            img_malumot_2.setImageResource(R.drawable.chashma_ayub)
            text_malumot.text = getString(R.string.chashma_ayub)
        }
        else if (intent.getStringExtra("Name") == "Somoniylar") {
            img_malumot_1.setImageResource(R.drawable.somoniylar)
            img_malumot_2.setImageResource(R.drawable.somoniylar)
            text_malumot.text = getString(R.string.somoniylar)
        }
        else if (intent.getStringExtra("Name") == "ArkQala") {
            img_malumot_1.setImageResource(R.drawable.ark)
            img_malumot_2.setImageResource(R.drawable.ark)
            text_malumot.text = getString(R.string.ark)
        }
        else if (intent.getStringExtra("Name") == "Avesto") {
            img_malumot_1.setImageResource(R.drawable.avesto)
            img_malumot_2.setImageResource(R.drawable.avesto)
            text_malumot.text = getString(R.string.avesto)
        }
        else if (intent.getStringExtra("Name") == "Sulaymon_qala") {
            img_malumot_1.setImageResource(R.drawable.sulaymon_qala)
            img_malumot_2.setImageResource(R.drawable.sulaymon_qala)
            text_malumot.text = getString(R.string.sulaymon_qala)
        }
        else if (intent.getStringExtra("Name") == "Yoshlar_koli") {
            img_malumot_1.setImageResource(R.drawable.yoshlar_koli)
            img_malumot_2.setImageResource(R.drawable.yoshlar_koli)
            text_malumot.text = getString(R.string.yoshlar_koli)
        }
        else if (intent.getStringExtra("Name") == "Nurulloboy_saroyi") {
            img_malumot_1.setImageResource(R.drawable.nurullaboy)
            img_malumot_2.setImageResource(R.drawable.nurullaboy)
            text_malumot.text = getString(R.string.nurullaboy)
        }
        else if (intent.getStringExtra("Name") == "Pahlavon_mahmud") {
            img_malumot_1.setImageResource(R.drawable.pahlavon_mahmud)
            img_malumot_2.setImageResource(R.drawable.pahlavon_mahmud)
            text_malumot.text = getString(R.string.pahlavon_mahmud)
        }
        else if (intent.getStringExtra("Name") == "Amirxon_madrasasi") {
            img_malumot_1.setImageResource(R.drawable.amir_maqbarasi)
            img_malumot_2.setImageResource(R.drawable.amir_maqbarasi)
            text_malumot.text = getString(R.string.amir_maqbarasi)
        }
        else if (intent.getStringExtra("Name") == "Ichanqala") {
            img_malumot_1.setImageResource(R.drawable.ichan_qala)
            img_malumot_2.setImageResource(R.drawable.ichan_qala)
            text_malumot.text = getString(R.string.ichan_qala)
        }
        else if (intent.getStringExtra("Name") == "QirqizQalasi") {
            img_malumot_1.setImageResource(R.drawable.qirq_qiz_surx)
            img_malumot_2.setImageResource(R.drawable.qirq_qiz_surx)
            text_malumot.text = getString(R.string.qirq_qiz_surx)
        }
        else if (intent.getStringExtra("Name") == "FazyozTepa") {
            img_malumot_1.setImageResource(R.drawable.fayoz_tepa)
            img_malumot_2.setImageResource(R.drawable.fayoz_tepa)
            text_malumot.text = getString(R.string.fayoz_tepa)
        }
        else if (intent.getStringExtra("Name") == "SultonSaodat") {
            img_malumot_1.setImageResource(R.drawable.sulton_saodat)
            img_malumot_2.setImageResource(R.drawable.sulton_saodat)
            text_malumot.text = getString(R.string.sulton_saodat)
        }
        else if (intent.getStringExtra("Name") == "Alhakim") {
            img_malumot_1.setImageResource(R.drawable.al_hakim)
            img_malumot_2.setImageResource(R.drawable.al_hakim)
            text_malumot.text = getString(R.string.al_hakim)
        }
        else if (intent.getStringExtra("Name") == "Termiziy_maqbarasi") {
            img_malumot_1.setImageResource(R.drawable.termiziy_maq)
            img_malumot_2.setImageResource(R.drawable.termiziy_maq)
            text_malumot.text = getString(R.string.termiziy_maq)
        }
        else if (intent.getStringExtra("Name") == "QadimiyQala") {
            img_malumot_1.setImageResource(R.drawable.qadimiy_qala )
            img_malumot_2.setImageResource(R.drawable.qadimiy_qala)
            text_malumot.text = getString(R.string.qadimiy_qala)
        }
        else if (intent.getStringExtra("Name") == "QutaybaibnMuslim") {
            img_malumot_1.setImageResource(R.drawable.qutayba_ibn_muslim)
            img_malumot_2.setImageResource(R.drawable.qutayba_ibn_muslim)
            text_malumot.text = getString(R.string.qutayba_ibn_muslim)
        }
        else if (intent.getStringExtra("Name") == "JomeMemori") {
            img_malumot_1.setImageResource(R.drawable.jome)
            img_malumot_2.setImageResource(R.drawable.jome)
            text_malumot.text = getString(R.string.jome)
        }
        else if (intent.getStringExtra("Name") == "Xonabod") {
            img_malumot_1.setImageResource(R.drawable.xonabod)
            img_malumot_2.setImageResource(R.drawable.xonabod)
            text_malumot.text = getString(R.string.xonabod)
        }
        else if (intent.getStringExtra("Name") == "ImomOta") {
            img_malumot_1.setImageResource(R.drawable.imom_ota)
            img_malumot_2.setImageResource(R.drawable.imom_ota)
            text_malumot.text = getString(R.string.imom_ota)
        }
        else if (intent.getStringExtra("Name") == "Mingtepa") {
            img_malumot_1.setImageResource(R.drawable.ming_tepa)
            img_malumot_2.setImageResource(R.drawable.ming_tepa)
            text_malumot.text = getString(R.string.ming_tepa)
        }
        else if (intent.getStringExtra("Name") == "Shohimardon") {
            img_malumot_1.setImageResource(R.drawable.shohimardon)
            img_malumot_2.setImageResource(R.drawable.shohimardon)
            text_malumot.text = getString(R.string.shohimardon)
        }
        else if (intent.getStringExtra("Name") == "Quva") {
            img_malumot_1.setImageResource(R.drawable.quva)
            img_malumot_2.setImageResource(R.drawable.quva)
            text_malumot.text = getString(R.string.quva)
        }
        else if (intent.getStringExtra("Name") == "Modarixon") {
            img_malumot_1.setImageResource(R.drawable.modarixon)
            img_malumot_2.setImageResource(R.drawable.modarixon)
            text_malumot.text = getString(R.string.modarixon)
        }
        else if (intent.getStringExtra("Name") == "Xudoyarxon") {
            img_malumot_1.setImageResource(R.drawable.xudoyarxon_saroyi)
            img_malumot_2.setImageResource(R.drawable.xudoyarxon_saroyi)
            text_malumot.text = getString(R.string.xudoyarxon_saroyi)
        }
        else if (intent.getStringExtra("Name") == "Qoqon") {
            img_malumot_1.setImageResource(R.drawable.qoqon)
            img_malumot_2.setImageResource(R.drawable.qoqon)
            text_malumot.text = getString(R.string.qoqon)
        }
        else if (intent.getStringExtra("Name") == "Chashma") {
            img_malumot_1.setImageResource(R.drawable.chashma)
            img_malumot_2.setImageResource(R.drawable.chashma)
            text_malumot.text = getString(R.string.chashma)
        }
        else if (intent.getStringExtra("Name") == "QosimShayx") {
            img_malumot_1.setImageResource(R.drawable.qosimshayx)
            img_malumot_2.setImageResource(R.drawable.qosimshayx)
            text_malumot.text = getString(R.string.qosimshayx)
        }
        else if (intent.getStringExtra("Name") == "MirSaidBahrom") {
            img_malumot_1.setImageResource(R.drawable.mir_said)
            img_malumot_2.setImageResource(R.drawable.mir_said)
            text_malumot.text = getString(R.string.mir_said)
        }
        else if (intent.getStringExtra("Name") == "BibiNaima") {
            img_malumot_1.setImageResource(R.drawable.bibixonim)
            img_malumot_2.setImageResource(R.drawable.bibixonim)
            text_malumot.text = getString(R.string.bibixonim)
        }
        else if (intent.getStringExtra("Name") == "DevonaBuva") {
            img_malumot_1.setImageResource(R.drawable.devon_buva)
            img_malumot_2.setImageResource(R.drawable.devon_buva)
            text_malumot.text = getString(R.string.devon_buva)
        }
        else if (intent.getStringExtra("Name") == "AxtamSaxoba") {
            img_malumot_1.setImageResource(R.drawable.sahoba)
            img_malumot_2.setImageResource(R.drawable.sahoba)
            text_malumot.text = getString(R.string.sahoba)
        }
        else if (intent.getStringExtra("Name") == "Margilon") {
            img_malumot_1.setImageResource(R.drawable.margilon)
            img_malumot_2.setImageResource(R.drawable.margilon)
            text_malumot.text = getString(R.string.margilon)
        }
        else if (intent.getStringExtra("Name") == "Lochin") {
            img_malumot_1.setImageResource(R.drawable.lochin)
            img_malumot_2.setImageResource(R.drawable.lochin)
            text_malumot.text = getString(R.string.lochin)
        }
        else if (intent.getStringExtra("Name") == "TohirZuhra") {
            img_malumot_1.setImageResource(R.drawable.tohir_zuhra)
            img_malumot_2.setImageResource(R.drawable.tohir_zuhra)
            text_malumot.text = getString(R.string.tohir_zuhra)
        }
        else if (intent.getStringExtra("Name") == "SuvTushar") {
            img_malumot_1.setImageResource(R.drawable.suvtushar)
            img_malumot_2.setImageResource(R.drawable.suvtushar)
            text_malumot.text = getString(R.string.suvtushar)
        }
        else if (intent.getStringExtra("Name") == "TemurGori") {
            img_malumot_1.setImageResource(R.drawable.gori)
            img_malumot_2.setImageResource(R.drawable.gori)
            text_malumot.text = getString(R.string.gori)
        }
        else if (intent.getStringExtra("Name") == "LangarOta") {
            img_malumot_1.setImageResource(R.drawable.langar)
            img_malumot_2.setImageResource(R.drawable.langar)
            text_malumot.text = getString(R.string.langar)
        }
        else if (intent.getStringExtra("Name") == "Oqsaroy") {
            img_malumot_1.setImageResource(R.drawable.oqsaroy)
            img_malumot_2.setImageResource(R.drawable.oqsaroy)
            text_malumot.text = getString(R.string.oqsaroy)
        }
        else if (intent.getStringExtra("Name") == "TemirDarvoza") {
            img_malumot_1.setImageResource(R.drawable.temir_darvoza)
            img_malumot_2.setImageResource(R.drawable.temir_darvoza)
            text_malumot.text = getString(R.string.temir_darvoza)
        }
        else if (intent.getStringExtra("Name") == "SaidIbnVaqqos") {
            img_malumot_1.setImageResource(R.drawable.ibn_vaqqos)
            img_malumot_2.setImageResource(R.drawable.ibn_vaqqos)
            text_malumot.text = getString(R.string.Said_ibn_vaqqos)
        }
        else if (intent.getStringExtra("Name") == "ParpiOta") {
            img_malumot_1.setImageResource(R.drawable.parpi_ota)
            img_malumot_2.setImageResource(R.drawable.parpi_ota)
            text_malumot.text = getString(R.string.parpi_ota)
        }
        else if (intent.getStringExtra("Name") == "Majrumning") {
            img_malumot_1.setImageResource(R.drawable.majrumning)
            img_malumot_2.setImageResource(R.drawable.majrumning)
            text_malumot.text = getString(R.string.majrumning)
        }
        else if (intent.getStringExtra("Name") == "Nurota") {
            img_malumot_1.setImageResource(R.drawable.nurota)
            img_malumot_2.setImageResource(R.drawable.nurota)
            text_malumot.text = getString(R.string.nurota)
        }
        else if (intent.getStringExtra("Name") == "Zomin") {
            img_malumot_1.setImageResource(R.drawable.zomin)
            img_malumot_2.setImageResource(R.drawable.zomin)
            text_malumot.text = getString(R.string.zomin)
        }
        else if (intent.getStringExtra("Name") == "ChardjauAbdirev") {
            img_malumot_1.setImageResource(R.drawable.abdirev_maqbarasi)
            img_malumot_2.setImageResource(R.drawable.abdirev_maqbarasi)
            text_malumot.text = getString(R.string.ChardjauAbdirevMaqbarasi)
        }
        else if (intent.getStringExtra("Name") == "BeshTubaTepaligi") {
            img_malumot_1.setImageResource(R.drawable.teaplig)
            img_malumot_2.setImageResource(R.drawable.teaplig)
            text_malumot.text = getString(R.string.BeshTubaTepaligi)
        }
        else if (intent.getStringExtra("Name") == "XakimOta") {
            img_malumot_1.setImageResource(R.drawable.xakim)
            img_malumot_2.setImageResource(R.drawable.xakim)
            text_malumot.text = getString(R.string.XakimOtaMaqbarasi)
        }
        else if (intent.getStringExtra("Name") == "MadaminXan") {
            img_malumot_1.setImageResource(R.drawable.madamin)
            img_malumot_2.setImageResource(R.drawable.madamin)
            text_malumot.text = getString(R.string.MadaminXan)
        }
        else if (intent.getStringExtra("Name") == "Qirqizqala") {
            img_malumot_1.setImageResource(R.drawable.qirqiz)
            img_malumot_2.setImageResource(R.drawable.qirqiz)
            text_malumot.text = getString(R.string.Qirqizqala)
        }
        else if (intent.getStringExtra("Name") == "Urgaqala") {
            img_malumot_1.setImageResource(R.drawable.urgaqala)
            img_malumot_2.setImageResource(R.drawable.urgaqala)
            text_malumot.text = getString(R.string.Urgaqala)
        }
        else if (intent.getStringExtra("Name") == "Angkaqala") {
            img_malumot_1.setImageResource(R.drawable.angkaqala)
            img_malumot_2.setImageResource(R.drawable.angkaqala)
            text_malumot.text = getString(R.string.Angkaqala)
        }
        else if (intent.getStringExtra("Name") == "PoiKalon") {
            img_malumot_1.setImageResource(R.drawable.poi_kalon)
            img_malumot_2.setImageResource(R.drawable.poi_kalon)
            text_malumot.text = getString(R.string.poi_kalon)}


    }
}