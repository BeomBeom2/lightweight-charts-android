package com.tradingview.lightweightcharts.api.series.models

import com.tradingview.lightweightcharts.api.chart.models.color.IntColor

data class LineData(
    /**
     * Optional color value for certain data item. If missed, color from options is used
     */
    val color: IntColor? = null,

    /**
     * The time of the data.
     */
    override val time: Time,

    /**
     * Price value of the data.
     */
    override val value: Float,
) : SingleValueData
