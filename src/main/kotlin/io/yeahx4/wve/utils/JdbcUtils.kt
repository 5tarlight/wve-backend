package io.yeahx4.wve.utils

import java.util.Optional

class JdbcUtils {
    companion object {
        fun <T> optToNullable(opt: Optional<T>): T? {
            return if (opt.isEmpty) {
                null
            } else {
                opt.get()
            }
        }
    }
}
