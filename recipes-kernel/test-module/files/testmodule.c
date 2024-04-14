#include <linux/module.h>	/* Needed by all modules */
#include <linux/kernel.h>	/* Needed for KERN_INFO */

int init_module(void)
{
				printk(KERN_INFO "Hello from custom module! .\n");

				return 0;
}

void cleanup_module(void)
{
				printk(KERN_INFO "Goodbye, closing custom module!.\n");
}
MODULE_LICENSE("GPL") ;