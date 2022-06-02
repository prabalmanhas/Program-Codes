print(">>>>>WELCOME TO MY PROGRAM<<<<\n")

dateofbirth = int(input(">>PLEASE ENTER YOUR DATE OF BIRTH, PRABAL<<\n"))
monthofbirth = input(">>INPUT YOUR MONTH OF BIRTH<<\n")

if monthofbirth == 'DECEMBER':
	astro_sign = 'SAGITTARIUS' if (dateofbirth < 22) else 'CAPRICON'

elif monthofbirth == 'JANUARY':
	astro_sign = 'CAPRICON' if (dateofbirth < 20) else 'AQUARIUS'

elif monthofbirth == 'FEBRUARY':
	astro_sign = 'AQUARIUS' if (dateofbirth < 19) else 'PISCES'

elif monthofbirth == 'MARCH':
	astro_sign = 'PISCES' if (dateofbirth < 21) else 'ARIES'

elif monthofbirth == 'APRIL':
	astro_sign = 'ARIES' if (dateofbirth < 20) else 'TAURUS'

elif monthofbirth == 'MAY':
	astro_sign = 'TAURUS' if (dateofbirth < 21) else 'GEMINI'

elif monthofbirth == 'JUNE':
	astro_sign = 'GEMINI' if (dateofbirth < 21) else 'CANCER'

elif monthofbirth == 'JULY':
	astro_sign = 'CANCER' if (dateofbirth < 23) else 'LEO'

elif monthofbirth == 'AUGUST':
	astro_sign = 'LEO' if (dateofbirth < 23) else 'VIRGO'

elif monthofbirth == 'SEPTEMBER':
	astro_sign = 'VIRGO' if (dateofbirth < 23) else 'LIBRA'

elif monthofbirth == 'OCTOBER':
	astro_sign = 'LIBRA' if (dateofbirth < 23) else 'SCORPIO'

elif monthofbirth == 'NOVEMBER':
	astro_sign = 'SCORPIO' if (dateofbirth < 22) else 'SAGITTARIUS'

print(">>>PRABAL, YOUR ASTROLOGICAL SIGN IS >>>",astro_sign)
