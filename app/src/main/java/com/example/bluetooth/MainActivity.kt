package com.example.bluetooth

import android.app.Activity
import android.bluetooth.BluetoothAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.PixelCopy.Request
import android.widget.Toast
import com.example.bluetooth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    //variaveis para habilitar e deixar disponivel o Bluetooth
    private val REQUEST_CODE_ENABLE_BT = 1;
   private val REQUEST_CODE_DISCOVERABLE_BT = 2;

    //Adaptar Bluetooth
    private lateinit var bluetoothAdapter: BluetoothAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Inicializar o Adaptador do Bluetooth
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        //Status do Bluetooth ON/OFF
        if (bluetoothAdapter == null){
            binding.bluetoothStatus.text = "Não disponível"
        }     else {
            binding.bluetoothStatus.text ="Disponível"
        }
         //Status bluetooth ON/OFF com Imagem
         if (bluetoothAdapter.isEnabled){
             binding.bluetoothoImg.setImageResource(R.drawable.ic_bluetooth_on)
         }else{
             binding.bluetoothoImg.setImageResource(R.drawable.ic_bluetooth_of)
         }

        //Ação de clique para habilitar Bluetooth
        binding.bntLigarBlutooth.setOnClickListener {
            if (bluetoothAdapter.isEnabled){
               Toast.makeText(
               )
            }else{
                val Intent =
                
            }
        }


    }
}