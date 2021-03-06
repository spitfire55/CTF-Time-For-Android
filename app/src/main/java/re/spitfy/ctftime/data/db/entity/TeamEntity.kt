package re.spitfy.ctftime.data.db.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "team")
data class TeamEntity (
    @PrimaryKey val id: Int = 0,
    var academic: String = "",
    var aliases: String = "",
    @ColumnInfo(name = "country_code")
    var countryCode: String = "",
    var description: String = "",
    var email: String = "",
    var icq: String = "",
    var jabber: String = "",
    var linkedin: String = "",
    var logo: String = "",
    var name: String = "",
    @ColumnInfo(name = "name_case_insensitive")
    var nameCaseInsensitive: String = "",
    var otherLinks: String = "",
    var scores: String = "",
    var skype: String = "",
    var telegram: String = "",
    var twitter: String = "",
    var website: String = ""
)
