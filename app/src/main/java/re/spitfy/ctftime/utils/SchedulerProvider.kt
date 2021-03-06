package re.spitfy.ctftime.utils

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun newThread(): Scheduler
    fun io(): Scheduler
}