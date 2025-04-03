package com.example.data.service

import com.example.data.service.dto.UserSaveDTO
import com.example.data.service.mapper.IUserMapper
import com.example.payment.repository.dal.PaymentApplicationHelper
import com.karandev.util.data.repository.exception.RepositoryException
import com.karandev.util.data.service.DataServiceException
import javax.inject.Inject

class PaymentAppDataService @Inject constructor(
    paymentApplicationHelper: PaymentApplicationHelper,
    userMapper: IUserMapper
){

    private val mPaymentApplicationHelper = paymentApplicationHelper
    private val mUserMapper = userMapper
    fun saveUser(userSaveDTO: UserSaveDTO): Boolean
    {
        var result = false
        try
        {
            mPaymentApplicationHelper.saveUser(mUserMapper.toUser(userSaveDTO))
            result = true
        }
        catch (ex: RepositoryException)
        {
            throw DataServiceException("PaymentApplicationDataService.saveUser", ex.cause)
        }
        catch (ex: Throwable)
        {
            throw DataServiceException("PaymentApplicationDataService.saveUser", ex)
        }
          return result
    }
}