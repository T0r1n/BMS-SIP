import org.pjsip.pjsua2.AuthCredInfo
import org.pjsip.pjsua2.EpConfig
import org.pjsip.pjsua2.TransportConfig
import org.pjsip.pjsua2.pjsip_transport_type_e

public class PJSIPManager {
    private lateinit var endpoint: Endpoint
    private lateinit var account: Account

    fun initialize() {
        endpoint = Endpoint()
        endpoint.libCreate()

        val epConfig = EpConfig()
        endpoint.libInit(epConfig)

        val transportConfig = TransportConfig()
        transportConfig.port = 5060

        endpoint.transportCreate(pjsip_transport_type_e.PJSIP_TRANSPORT_UDP, transportConfig)
        endpoint.libStart()
    }

    fun createAccount(username: String, password: String) {
        val accountConfig = AccountConfig()
        accountConfig.idUri = "sip:$username@192.168.17.128"
        accountConfig.regConfig.registrarUri = "sip:192.168.17.128"
        accountConfig.sipConfig.authCreds.add(AuthCredInfo("Digest", "*", username, 0, password))

        account = endpoint.createAccount(accountConfig)
        account.register()
    }

    // Добавьте другие методы для обработки звонков, отправки сообщений и т.д.
}
