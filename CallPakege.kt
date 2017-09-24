/**
 * Created by Baraa AbdAlhafiz on 9/22/2017.
 */

import com.Baraa.Alhafiz.AadminOo
import com.Baraa.Alhafiz.UserOo

fun main(args: Array<String>) {
    var user = UserOo()
    user.sum(12.0,10.0)
    user.sub(12.0,10.0)

    var admin = AadminOo()
    admin.sum(12.0,10.0)
    admin.sub(12.0,10.0)

}