import geocoder
import folium

print("\t\t<<< 🌐 𝐈𝐏 𝐓𝐑𝐀𝐂𝐊𝐄𝐑 🔍 - 𝐌𝐈𝐍𝐎𝐑 𝐏𝐑𝐎𝐉𝐄𝐂𝐓 - 𝐏𝐑𝐀𝐁𝐀𝐋 𝐌𝐀𝐍𝐇𝐀𝐒 >>>")
print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n")

print("> 🔍 𝐓𝐑𝐀𝐂𝐈𝐍𝐆 𝐘𝐎𝐔𝐑 𝐄𝐍𝐓𝐄𝐑𝐄𝐃 𝐈𝐏 𝐀𝐃𝐃𝐑𝐄𝐒𝐒 ... 𝐏𝐋𝐄𝐀𝐒𝐄 𝐖𝐀𝐈𝐓 ⏳")

print("> 𝐅𝐄𝐓𝐂𝐇𝐈𝐍𝐆 𝐈𝐏 𝐀𝐃𝐃𝐑𝐄𝐒𝐒 𝐋𝐎𝐂𝐀𝐓𝐈𝐎𝐍 𝐂𝐎𝐎𝐑𝐃𝐈𝐍𝐀𝐓𝐄𝐒 🗺️\n")

print("𝐘𝐎𝐔𝐑 𝐋𝐎𝐍𝐆𝐈𝐓𝐔𝐃𝐄 & 𝐋𝐀𝐓𝐈𝐓𝐔𝐃𝐄 𝐕𝐀𝐋𝐔𝐄𝐒 𝐀𝐑𝐄 𝐀𝐒 𝐅𝐎𝐋𝐋𝐎𝐖𝐒: 📝\n")
g = geocoder.ip("110.224.240.131")
myAddress = g.latlng
print(myAddress)

my_map1 = folium.Map(location=myAddress,
                     zoom_start=12)

folium.CircleMarker(location=myAddress,
                    radius=50, popup="𝐓𝐑𝐀𝐂𝐊𝐄𝐃 𝐋𝐎𝐂𝐀𝐓𝐈𝐎𝐍 >>>").add_to(my_map1)

folium.Marker(myAddress,
              popup="𝐓𝐑𝐀𝐂𝐊𝐄𝐃 𝐋𝐎𝐂𝐀𝐓𝐈𝐎𝐍 >>>").add_to(my_map1)
my_map1.save("my_map.html ")

print("𝐓𝐑𝐀𝐂𝐄𝐃 𝐈𝐏 𝐃𝐄𝐓𝐀𝐈𝐋𝐒 𝐒𝐔𝐂𝐂𝐄𝐒𝐅𝐔𝐋𝐋𝐘 ... 𝐒𝐓𝐎𝐑𝐄𝐃 𝐈𝐍 𝐓𝐇𝐄 𝐇𝐓𝐌𝐋 𝐅𝐈𝐋𝐄 🌐")

print("𝐎𝐏𝐄𝐍 𝐇𝐓𝐌𝐋 𝐅𝐈𝐋𝐄 𝐓𝐎 𝐓𝐑𝐀𝐂𝐄 𝐎𝐍 𝐌𝐀𝐏 🗺️\n")
print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

print('''\t𝐏𝐑𝐀𝐁𝐀𝐋 𝐌𝐀𝐍𝐇𝐀𝐒 𝟐𝟎𝐁𝐂𝐒𝟒𝟓𝟏𝟑
\t\t 𝐀𝐍𝐔𝐑𝐀𝐆 𝐊𝐔𝐌𝐀𝐑 𝟐𝟎𝐁𝐂𝐒𝟒𝟓𝟔𝟕
\t\t\t 𝐆𝐈𝐑𝐉𝐀𝐍𝐀𝐍𝐃 𝐓𝐈𝐖𝐀𝐑𝐘 𝟐𝟎𝐁𝐂𝐒𝟒𝟓𝟎𝟔''')