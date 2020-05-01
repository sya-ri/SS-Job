package me.syari.ss.job.grade.grade2

import me.syari.ss.job.WeaponType
import me.syari.ss.job.grade.JobData
import me.syari.ss.job.grade.Requirement
import me.syari.ss.job.grade.grade1.Knight
import me.syari.ss.job.grade.grade1.Warrior
import me.syari.ss.job.skill.active.ActiveSkill
import me.syari.ss.job.skill.passive.PassiveSkill
import org.bukkit.Material

object SwordMan: JobData {
    override val id = "swordman"
    override val display = "ソードマン"
    override val icon = Material.IRON_SWORD
    override val description = ""
    override val availableWeaponType = setOf(
        WeaponType.Sword
    )
    override val requirements = setOf(
        Requirement.Point(5), Requirement.Job(Warrior), Requirement.Job(Knight)
    )
    override val activeSkill = listOf<ActiveSkill>(

    )
    override val passiveSkill = listOf<PassiveSkill>(

    )
}