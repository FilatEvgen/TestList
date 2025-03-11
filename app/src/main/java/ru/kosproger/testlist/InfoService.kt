package ru.kosproger.testlist

import ru.kosproger.testlist.api.InfoClass
import ru.kosproger.testlist.api.RetrofitClient

class InfoService {
    suspend fun fetchInfo(): List<InfoClass> {
        return RetrofitClient.apiService.getInfo()
    }
}