package com.gunes;

public class AsciiArtPrinter {
    private static final int HARF_YUKSEKLIK = 7;
    private static final int HARF_GENISLIK = 8;

    private static final String[][] HARFLER = {
        { // A
            "   ###   ",
            "  #   #  ",
            " #     # ",
            " ####### ",
            " #     # ",
            " #     # ",
            " #     # "
        },
        { // B
            " ######  ",
            " #     # ",
            " #     # ",
            " ######  ",
            " #     # ",
            " #     # ",
            " ######  "
        },
        { // C
            "  ##### ",
            " #     #",
            " #      ",
            " #      ",
            " #      ",
            " #     #",
            "  ##### "
        },
        { // D
            " #####   ",
            " #    #  ",
            " #     # ",
            " #     # ",
            " #     # ",
            " #    #  ",
            " #####   "
        },
        { // E
            " ####### ",
            " #       ",
            " #       ",
            " #####   ",
            " #       ",
            " #       ",
            " ####### "
        },
        { // F
            " ####### ",
            " #       ",
            " #       ",
            " #####   ",
            " #       ",
            " #       ",
            " #       "
        },
        { // G
            "  #####  ",
            " #     # ",
            " #       ",
            " #   ### ",
            " #     # ",
            " #     # ",
            "  #####  "
        },
        { // H
            " #     # ",
            " #     # ",
            " #     # ",
            " ####### ",
            " #     # ",
            " #     # ",
            " #     # "
        },
        { // I
            " ####### ",
            "    #    ",
            "    #    ",
            "    #    ",
            "    #    ",
            "    #    ",
            " ####### "
        },
        { // J
            " ####### ",
            "    #    ",
            "    #    ",
            "    #    ",
            " #  #    ",
            " #  #    ",
            "  ##     "
        },
        { // K
            " #    #  ",
            " #   #   ",
            " #  #    ",
            " ###     ",
            " #  #    ",
            " #   #   ",
            " #    #  "
        },
        { // L
            " #       ",
            " #       ",
            " #       ",
            " #       ",
            " #       ",
            " #       ",
            " ####### "
        },
        { // M
            " #     # ",
            " ##   ## ",
            " # # # # ",
            " #  #  # ",
            " #     # ",
            " #     # ",
            " #     # "
        },
        { // N
            " #     # ",
            " ##    # ",
            " # #   # ",
            " #  #  # ",
            " #   # # ",
            " #    ## ",
            " #     # "
        },
        { // O
            "  #####  ",
            " #     # ",
            " #     # ",
            " #     # ",
            " #     # ",
            " #     # ",
            "  #####  "
        },
        { // P
            " ######  ",
            " #     # ",
            " #     # ",
            " ######  ",
            " #       ",
            " #       ",
            " #       "
        },
        { // Q
            "  #####  ",
            " #     # ",
            " #     # ",
            " #     # ",
            " #   # # ",
            " #    #  ",
            "  #### # "
        },
        { // R
            " ######  ",
            " #     # ",
            " #     # ",
            " ######  ",
            " #   #   ",
            " #    #  ",
            " #     # "
        },
        { // S
            "  ##### ",
            " #     #",
            " #      ",
            "  ####  ",
            "      # ",
            " #    # ",
            "  ####  "
        },
        { // T
            " ####### ",
            "    #    ",
            "    #    ",
            "    #    ",
            "    #    ",
            "    #    ",
            "    #    "
        },
        { // U
            " #     # ",
            " #     # ",
            " #     # ",
            " #     # ",
            " #     # ",
            " #     # ",
            "  #####  "
        },
        { // V
            " #     # ",
            " #     # ",
            " #     # ",
            " #     # ",
            "  #   #  ",
            "   # #   ",
            "    #    "
        },
        { // W
            " #     # ",
            " #     # ",
            " #     # ",
            " #  #  # ",
            " # # # # ",
            " ##   ## ",
            " #     # "
        },
        { // X
            " #     # ",
            "  #   #  ",
            "   # #   ",
            "    #    ",
            "   # #   ",
            "  #   #  ",
            " #     # "
        },
        { // Y
            " #     # ",
            "  #   #  ",
            "   # #   ",
            "    #    ",
            "    #    ",
            "    #    ",
            "    #    "
        },
        { // Z
            " ####### ",
            "      #  ",
            "     #   ",
            "   #     ",
            "  #      ",
            " #       ",
            " ####### "
        }
    };

    public void yazdir(String metin) {
        metin = metin.toUpperCase();
        
        // Her satır için
        for (int satir = 0; satir < HARF_YUKSEKLIK; satir++) {
            // Metindeki her harf için
            for (int i = 0; i < metin.length(); i++) {
                char harf = metin.charAt(i);
                if (harf >= 'A' && harf <= 'Z') {
                    System.out.print(HARFLER[harf - 'A'][satir] + " ");
                } else {
                    // Tanımlanmamış karakterler için boşluk bırak
                    System.out.print("        ");
                }
            }
            System.out.println();
        }
    }
} 
