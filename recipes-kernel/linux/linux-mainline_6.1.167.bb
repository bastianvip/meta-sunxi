require linux-mainline.inc

DESCRIPTION = "Mainline Longterm Linux kernel"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI:append:orange-pi-zero2w = " \
            file://defconfig \
            file://0001-axp20x-Add-support-for-AXP313a-PMIC.patch \
            file://0002-arm64-dts-allwiner-sun50i-h616.dtsi-add-usb-ehci-ohc.patch \
            file://0003-arm64-dts-allwinner-h616-Add-device-node-for-SID.patch \
            file://0004-arm64-dts-allwinner-h616-Add-thermal-sensor-and-ther.patch \
            file://0005-arm64-dts-allwinner-h616-Fix-thermal-zones-add-missi.patch \
            file://0006-arm64-dts-allwinner-sun50i-h616-Add-GPU-node.patch \
            file://0007-arm64-dts-allwinner-sun50i-h616-Add-VPU-node.patch \
            file://0008-arm64-dts-sun50i-h616-orangepi-zero2-Add-reg_usb1_vb.patch \
            file://0009-arm64-dts-sun50i-h616-orangepi-zero2-Enable-ehci1-oh.patch \
            file://0010-arm64-dts-sun50i-h616-orangepi-zero2-Enable-GPU-mali.patch \
            file://0011-drivers-hack-for-h616-hdmi-video-output.patch \
            file://0012-sound-soc-sunxi-Add-codec-driver-for-h616.patch \
            file://0013-drivers-pwm-Add-pwm-sunxi-enhance-driver-for-h616.patch \
            file://0015-net-wireless-Add-uwe5622-driver.patch \
            file://0016-driver-dma-Support-h616.patch \
            file://0017-sound-soc-Add-sunxi_v2-for-h616-ahub.patch \
            file://0018-scripts-package-Update-builddeb-and-mkdebian-for-bui.patch \
            file://0019-nvmem-sunxi_sid-add-sunxi_get_soc_chipid-sunxi_get_s.patch \
            file://0020-Add-dump_reg-and-sunxi-sysinfo-drivers.patch \
            file://0021-drivers-misc-sunxi-addr-Used-to-fix-uwe5622-bluetoot.patch \
            file://0022-scripts-add-overlay-compilation-support.patch \
            file://0023-scripts-enable-kernel-dtbs-symbol-generation.patch \
            file://0024-scripts-Makefile.lib-Add-Overlays-for-sunxi-sunxi64.patch \
            file://0025-drv-nvmem-sunxi_sid-Support-SID-on-H616.patch \
            file://0026-rtc-sun6i-Allow-RTC-wakeup-after-shutdown.patch \
            file://0027-arch-arm64-boot-dts-allwinner-Support-Orange-Pi-Zero.patch \
            file://0028-arch-arm64-boot-dts-allwinner-overlays-Add-Overlays-.patch \
            file://0029-drv-phy-sun4i-usb-Allow-reset-line-to-be-shared.patch \
            file://0030-net-phy-add-sysfs-node-for-reading-PHY-s-registers.patch \
            file://0031-net-phy-Add-driver-for-Motorcomm-yt85xx-gigabit-ethe.patch \
            file://0032-drv-thermal-sun8i_thermal-Add-for-H616.patch \
            file://0033-drv-soc-sunxi-sram-Add-SRAM-C1-H616-handling.patch \
            file://0034-drv-staging-media-sunxi-cedrus-add-H616-variant.patch \
            file://0035-opp-core-Avoid-confusing-error-when-no-regulator-is-.patch \
            file://0036-media-cedrus-Fix-failure-to-clean-up-hardware-on-pro.patch \
            file://0037-media-cedrus-Fix-missing-cleanup-in-error-path.patch \
            file://0038-drv-spi-spidev-Add-orangepi-spi-dev-compatible.patch \
            file://0039-Fix-include-uapi-spi-spidev-module.patch \
            file://0040-fix-gpio-kconfig-remove-if-EXPERT-to-allow-normal-bu.patch \
            file://0041-fix-spreadtrum-sprd-bluetooth-broken-park-link-statu.patch \
            file://0042-driver-net-phy-fix-rtl8211e-f-leds.patch \
            file://0043-arch-arm64-boot-dts-allwinner-Update-for-Orange-Pi-Z.patch \
            file://0044-drivers-cpufreq-Support-H616.patch \
            file://0045-arch-arm64-boot-dts-allwinner-Add-sun50i-h616-cpu-op.patch \
            file://0046-arch-arm64-boot-dts-allwinner-Disable-some-boards.patch \
            file://0047-drivers-net-wireless-uwe5622-Fix-dev_addr_check-warn.patch \
            file://0048-arch-arm64-boot-dts-allwinner-Support-Orange-Pi-Zero.patch \
            file://0049-arch-arm64-boot-dts-allwinner-overlay-Add-some-overl.patch \
            file://0050-mtd-spi-nor-Support-zb25vq128a-16mb-spiflash.patch \
            file://0051-arch-arm64-configs-Add-linux_sunxi64_defconfig.patch \
            file://0052-mtd-spi-nor-Support-zb25vq16as-2mb-spiflash.patch \
            file://0053-opizero2w-Support-h618-emac.patch \
            file://0054-net-sunxi-ephy-Disable-link-led-to-avoid-conflict-wi.patch \
            file://0055-mfd-axp313a-Support-powerkey.patch \
            file://0056-opizero2w-Support-lradc-keys.patch \
            file://0057-opizero3-opizero2w-dts-rename-h616-to-h618.patch \
            file://0058-uwe5622-fix-pathes.patch \
            file://0060-backport-v6.9-thermal-drivers-sun8i-fix-temperature-.patch \
            file://0061-fix-Waiting-for-rootfs-on-dev-mmcblk0p1.patch \
"

SRC_URI[sha256sum] = "2818053c07976ba4ed5f44deb0f5dc7ae7b0975d7918c313d48d8fe7c4e598cb"