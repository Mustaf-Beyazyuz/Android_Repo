package com.example.a003_basicviews.globalAlert

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
import com.example.a003_basicviews.R

public fun promptNotConfirmDialog(context: Context,titleResId:Int,messageResId: Int,
                                  neutralButtonResId: Int,
                                  callback: (DialogInterface,Int)-> Unit)
{

    AlertDialog.Builder(context)
        .setTitle(titleResId)
        .setMessage(messageResId)
        .setNeutralButton(neutralButtonResId){d,w-> callback}
        .create()
        .show()

}