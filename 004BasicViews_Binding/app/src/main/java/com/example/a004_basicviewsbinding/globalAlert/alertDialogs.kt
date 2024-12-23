package com.example.a004_basicviewsbinding.globalAlert

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

 fun promptNotConfirmDialog(context: Context,titleResId:Int,messageResId: Int,
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

fun promptDecision(context: Context,titleResId:Int,messageResId: Int,
                   positiveButtonResId: Int,negativeButtonResId:Int,
                   positiveButtonCallBack : (DialogInterface,Int)-> Unit,
                   negativeButtonCallBack : (DialogInterface,Int)-> Unit)
{

    AlertDialog.Builder(context)
        .setTitle(titleResId)
        .setMessage(messageResId)
        .setPositiveButton(positiveButtonResId){d,w-> positiveButtonCallBack(d,w)}
        .setNegativeButton(negativeButtonResId){d,w->negativeButtonCallBack(d,w)}
        .create()
        .show()

}