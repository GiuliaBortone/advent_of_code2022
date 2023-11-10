import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CampTests {
    // region inputs
    String shortInput = """
            2-4,6-8
            2-3,4-5
            5-7,7-9
            2-8,3-7
            6-6,4-6
            2-6,4-8""";

    String longInput = """
            12-80,12-81
            13-94,14-93
            9-9,10-61
            8-9,9-93
            36-63,55-63
            45-90,67-81
            32-61,13-80
            33-65,34-34
            4-95,5-95
            1-86,7-52
            10-65,64-64
            24-55,25-59
            19-81,6-19
            5-61,6-61
            85-85,11-86
            5-71,6-72
            71-94,70-93
            34-62,34-99
            51-80,57-90
            13-59,15-58
            65-84,64-87
            22-89,5-23
            5-5,6-98
            4-11,1-11
            85-96,5-86
            16-69,17-17
            69-70,14-70
            35-98,35-58
            73-83,81-81
            13-93,92-92
            2-92,96-99
            10-10,10-99
            3-70,2-70
            81-89,3-81
            8-9,9-78
            6-99,75-98
            11-88,11-90
            31-92,32-93
            9-98,90-93
            29-87,27-29
            17-95,17-95
            29-86,85-87
            16-19,1-18
            22-93,19-62
            34-96,34-95
            89-91,47-90
            47-71,52-70
            11-29,10-28
            23-30,23-80
            5-92,5-87
            53-53,7-53
            61-73,22-73
            34-49,32-67
            54-82,53-55
            5-29,27-29
            15-77,14-66
            22-76,21-22
            87-88,15-88
            38-38,19-37
            2-98,2-97
            36-94,35-36
            2-45,3-45
            99-99,57-92
            36-96,38-97
            2-97,2-98
            11-98,11-99
            44-92,93-95
            8-94,8-74
            7-24,23-45
            16-40,16-41
            21-76,7-75
            2-5,4-20
            96-99,77-97
            1-20,9-23
            14-33,33-48
            26-35,26-34
            67-99,17-68
            22-22,21-90
            2-9,8-87
            64-74,6-65
            39-99,17-39
            14-55,21-80
            39-88,65-87
            19-98,19-97
            49-50,3-49
            3-71,3-72
            84-88,83-88
            22-35,22-36
            25-96,24-69
            12-36,3-20
            42-84,41-71
            4-99,4-47
            53-59,54-59
            21-95,20-96
            17-50,44-60
            25-81,26-82
            3-96,2-95
            13-40,12-71
            30-98,30-69
            55-60,54-61
            43-96,42-95
            12-35,28-35
            2-2,3-92
            7-82,3-6
            92-99,92-97
            44-63,44-73
            71-71,57-72
            93-93,8-94
            5-83,4-82
            18-42,41-41
            6-27,7-27
            64-82,15-81
            2-61,5-60
            14-50,51-51
            50-53,49-49
            22-88,22-89
            7-87,1-88
            14-14,9-15
            23-27,23-29
            14-91,14-92
            63-72,47-80
            32-32,31-98
            18-40,9-17
            19-23,18-21
            5-97,6-97
            35-93,18-94
            27-95,24-94
            14-22,21-45
            60-75,59-76
            6-90,6-90
            72-72,16-73
            24-28,85-92
            13-93,13-92
            25-94,24-95
            20-65,20-45
            2-6,7-88
            17-97,16-17
            3-37,3-98
            75-93,43-96
            99-99,10-87
            39-39,39-90
            26-56,25-63
            23-28,29-76
            40-86,39-40
            2-94,3-95
            76-76,75-77
            16-82,15-81
            14-14,13-99
            1-38,37-98
            7-32,8-21
            1-7,5-86
            3-69,3-3
            33-92,33-91
            81-85,82-86
            1-95,94-95
            2-83,2-3
            9-58,10-10
            42-50,42-49
            58-66,18-66
            14-33,13-33
            39-76,39-40
            9-96,8-35
            94-97,11-93
            1-82,2-74
            8-10,15-98
            25-49,15-50
            86-95,63-87
            61-79,71-78
            29-81,43-98
            58-60,16-59
            41-64,40-64
            51-98,51-51
            30-31,31-98
            61-94,45-61
            32-55,33-64
            80-81,37-81
            37-84,36-37
            40-40,41-91
            20-83,20-83
            16-23,17-22
            36-52,35-53
            21-86,24-90
            14-81,15-81
            18-76,18-98
            88-90,7-89
            98-99,8-94
            26-57,26-27
            98-98,2-97
            18-28,17-28
            34-63,56-89
            18-70,18-69
            66-88,40-87
            12-68,69-76
            55-77,78-87
            20-77,25-78
            73-86,4-99
            41-54,53-53
            25-60,59-60
            61-84,61-83
            27-43,26-42
            8-62,15-42
            3-63,15-62
            27-84,26-85
            24-87,2-25
            23-30,29-98
            10-61,9-60
            9-93,9-51
            90-91,7-91
            14-20,4-14
            96-99,27-97
            21-93,13-22
            23-74,73-73
            10-85,1-84
            34-75,72-72
            59-93,59-94
            87-93,49-96
            8-97,8-89
            98-98,14-96
            38-92,93-96
            35-36,36-95
            14-38,15-99
            55-91,73-91
            10-19,11-62
            17-93,4-56
            45-88,24-46
            75-78,28-71
            4-87,3-86
            67-94,67-93
            48-86,16-47
            12-58,8-57
            13-14,1-14
            66-69,33-79
            25-97,19-97
            38-55,28-39
            2-93,3-92
            28-65,30-64
            68-68,65-70
            29-85,30-86
            2-99,98-98
            7-64,33-98
            28-95,96-98
            72-82,72-81
            25-68,18-96
            81-84,82-86
            9-75,9-76
            96-99,42-94
            11-75,4-12
            20-89,47-88
            56-84,36-56
            24-73,24-84
            50-84,11-83
            29-99,2-93
            32-48,31-48
            49-49,48-86
            30-30,30-49
            56-97,36-96
            14-22,23-31
            90-90,3-90
            23-26,23-27
            31-49,31-50
            1-14,2-13
            10-73,10-72
            4-73,4-73
            26-92,91-94
            12-98,16-99
            50-91,38-39
            76-96,77-82
            17-98,51-96
            3-73,1-4
            1-99,98-99
            80-83,81-81
            24-58,25-25
            22-65,64-65
            1-2,3-95
            30-71,60-68
            46-46,17-45
            24-66,22-65
            4-97,6-97
            53-67,54-54
            16-90,20-89
            53-95,31-96
            17-44,18-29
            2-58,57-57
            63-63,3-63
            19-75,20-80
            13-60,13-60
            49-50,50-76
            32-48,33-48
            22-34,22-35
            7-29,18-86
            52-85,84-84
            90-99,72-94
            8-73,10-83
            50-50,36-51
            40-75,40-74
            67-93,67-76
            79-80,18-66
            92-95,6-91
            1-99,9-99
            24-32,24-31
            7-8,7-93
            5-99,21-81
            82-90,89-92
            58-58,3-57
            4-95,5-98
            85-88,84-87
            3-92,2-92
            48-90,48-89
            8-97,7-15
            26-62,61-61
            82-82,4-81
            19-32,21-32
            1-5,6-75
            37-37,36-63
            14-34,15-34
            26-46,10-47
            10-29,10-28
            58-86,1-60
            36-36,35-81
            25-60,26-59
            2-94,1-99
            5-39,8-39
            16-95,17-17
            4-96,4-96
            80-95,15-79
            41-41,24-41
            25-67,32-66
            10-37,11-38
            15-83,48-64
            2-6,5-36
            77-88,3-78
            35-95,35-96
            51-69,24-96
            71-96,45-97
            1-93,5-94
            19-92,93-93
            54-84,54-89
            7-86,18-87
            12-12,13-90
            90-95,16-91
            6-73,6-73
            9-27,8-23
            13-48,12-26
            9-55,54-54
            23-99,29-98
            56-74,73-74
            46-87,29-89
            97-97,47-98
            17-82,8-16
            2-84,2-97
            41-53,3-40
            6-16,6-64
            41-43,6-42
            2-41,3-40
            17-66,18-81
            2-2,1-99
            30-54,6-54
            70-81,69-69
            46-72,46-73
            18-87,17-86
            10-95,10-95
            28-79,23-89
            13-52,28-52
            2-24,2-24
            35-35,36-86
            35-74,35-85
            79-83,26-83
            4-60,4-88
            5-5,5-94
            6-35,34-87
            2-2,1-97
            59-94,93-95
            10-88,88-95
            48-88,45-89
            85-88,88-89
            16-39,15-80
            3-97,2-99
            26-56,27-59
            7-98,6-7
            64-84,64-98
            38-91,38-99
            43-97,43-98
            68-71,29-85
            32-89,38-89
            1-4,5-99
            6-86,6-38
            25-99,24-98
            2-99,59-97
            15-66,15-67
            53-74,53-73
            43-87,43-86
            9-73,7-73
            8-97,8-9
            69-73,70-71
            20-25,26-31
            20-26,25-99
            29-51,30-52
            18-28,19-35
            19-72,20-20
            27-80,2-60
            90-90,79-91
            30-67,66-68
            82-90,48-62
            9-11,10-90
            13-98,17-98
            8-13,7-12
            14-56,15-98
            25-97,24-24
            46-64,45-64
            80-89,80-81
            40-57,56-57
            49-50,32-50
            25-66,24-67
            21-68,21-26
            6-99,3-98
            11-63,11-90
            6-8,7-84
            9-75,8-74
            64-65,41-65
            17-17,17-34
            69-69,47-70
            2-10,10-64
            85-97,55-84
            72-72,40-71
            19-90,20-20
            5-84,83-85
            27-81,27-81
            21-98,28-61
            3-5,4-90
            25-67,23-25
            96-96,27-97
            11-11,10-97
            39-91,65-91
            29-60,59-60
            24-24,25-77
            72-73,72-98
            10-28,10-29
            8-97,36-85
            7-81,7-80
            39-50,38-39
            29-55,28-56
            7-98,6-97
            3-96,1-2
            43-99,42-98
            36-64,37-66
            26-96,96-96
            39-82,38-38
            10-98,11-99
            1-14,4-89
            3-63,1-99
            4-98,4-97
            79-80,2-80
            8-88,7-88
            47-58,44-57
            29-97,97-99
            21-63,20-22
            14-82,4-14
            20-72,45-71
            85-92,58-86
            15-29,15-30
            30-76,29-29
            19-50,13-51
            12-93,2-94
            14-20,21-87
            53-83,52-84
            2-14,2-84
            10-98,99-99
            2-98,3-99
            46-60,46-94
            8-69,63-70
            93-93,2-92
            40-81,49-80
            80-81,10-81
            17-67,5-68
            27-88,27-87
            92-92,14-91
            98-99,17-97
            7-53,1-7
            5-79,6-96
            2-18,4-65
            1-55,1-54
            46-60,59-59
            47-68,6-64
            4-26,5-22
            15-16,16-17
            51-52,49-52
            20-36,20-35
            1-29,1-98
            11-79,10-80
            25-69,43-79
            45-65,46-94
            35-35,24-38
            22-88,1-99
            14-65,15-65
            4-4,4-99
            1-87,82-87
            13-51,14-14
            9-82,3-10
            4-15,14-38
            26-86,48-53
            3-93,1-1
            22-22,23-48
            35-97,36-36
            1-94,1-95
            31-31,30-82
            3-30,3-75
            46-79,46-79
            43-73,13-87
            14-88,14-92
            41-95,42-95
            1-64,63-63
            3-98,97-98
            75-75,75-96
            11-52,12-51
            11-11,12-98
            30-92,55-93
            15-98,15-87
            25-40,22-95
            60-61,61-87
            6-19,18-90
            2-8,9-94
            61-90,42-60
            82-92,81-91
            1-33,1-48
            51-93,50-51
            47-74,48-75
            1-89,1-88
            65-67,28-66
            9-98,63-97
            91-92,12-92
            67-91,86-87
            48-89,86-89
            87-87,3-88
            8-79,78-78
            87-87,6-88
            46-46,46-75
            35-57,36-70
            9-51,9-12
            28-92,1-92
            52-65,24-66
            45-72,44-44
            42-48,41-46
            6-26,20-31
            10-48,48-49
            4-50,4-50
            23-75,75-83
            33-34,33-85
            49-70,49-70
            3-84,1-83
            20-92,21-91
            1-92,1-93
            2-81,1-96
            18-39,38-73
            61-82,60-81
            1-21,1-99
            28-31,30-31
            45-46,44-84
            57-95,58-94
            18-46,20-46
            43-87,14-90
            6-95,4-31
            15-61,16-73
            14-97,15-96
            15-86,16-16
            18-55,18-54
            24-99,24-97
            11-15,16-32
            12-12,12-93
            15-24,15-67
            7-62,30-58
            5-94,3-4
            87-99,3-53
            1-45,1-45
            31-68,30-31
            1-38,14-39
            43-96,42-43
            4-98,5-98
            76-90,7-91
            63-80,62-81
            6-98,15-97
            2-56,36-55
            9-32,10-33
            54-74,54-86
            71-80,2-84
            10-10,9-96
            24-44,25-43
            17-40,17-87
            7-56,1-55
            47-47,47-48
            25-66,25-65
            2-3,1-96
            65-65,65-66
            16-96,16-98
            87-92,11-93
            28-58,8-57
            2-60,59-60
            7-19,20-88
            30-54,31-55
            41-78,40-77
            45-61,44-44
            30-97,29-92
            10-37,2-46
            3-59,2-60
            9-69,9-88
            72-94,73-86
            37-42,41-41
            82-91,40-92
            40-97,24-40
            26-88,26-81
            43-61,4-62
            6-97,79-98
            38-61,60-60
            35-53,35-53
            64-64,63-73
            40-42,22-41
            28-57,50-56
            4-93,80-81
            2-50,2-59
            16-50,15-16
            11-74,75-75
            7-71,2-81
            9-94,9-95
            70-84,69-84
            2-99,3-99
            8-82,6-7
            9-93,9-98
            62-69,62-62
            26-91,30-92
            7-94,8-95
            73-73,1-74
            24-24,25-80
            3-96,1-1
            12-34,5-60
            2-96,97-99
            11-96,10-96
            12-90,7-93
            10-61,60-62
            36-51,50-52
            38-98,39-39
            9-97,9-81
            27-62,28-62
            28-71,29-29
            16-40,16-18
            51-95,33-71
            21-71,72-72
            58-66,66-66
            11-11,11-65
            26-86,26-88
            41-93,63-93
            37-47,37-46
            31-99,31-98
            75-90,75-95
            6-15,14-20
            6-85,6-37
            43-97,88-96
            95-95,96-96
            1-20,6-58
            23-45,29-44
            8-35,17-37
            44-71,45-71
            59-79,49-79
            39-73,40-74
            56-77,55-60
            45-45,45-71
            11-89,11-90
            43-52,51-51
            57-96,57-97
            89-91,89-90
            23-90,1-90
            2-98,2-9
            6-63,28-62
            29-29,28-98
            3-77,5-78
            39-69,38-74
            10-97,9-99
            6-19,6-20
            52-66,13-81
            30-30,29-70
            67-96,67-91
            72-91,71-83
            1-94,36-93
            8-9,9-98
            3-78,73-77
            31-97,31-96
            44-70,65-67
            42-66,50-67
            6-79,5-80
            30-36,21-37
            38-43,39-51
            51-51,52-81
            10-87,87-88
            19-27,18-19
            13-99,85-98
            59-89,88-88
            25-26,26-97
            31-74,75-75
            6-95,95-95
            30-71,70-72
            24-51,23-95
            55-77,56-76
            26-49,26-48
            34-56,34-57
            9-11,8-10
            1-98,1-97
            6-97,12-96
            35-72,35-75
            2-99,4-99
            4-92,3-93
            6-98,13-99
            2-85,84-86
            90-98,5-90
            59-84,60-85
            9-19,19-93
            15-71,19-65
            98-99,85-99
            8-25,24-26
            42-72,42-71
            52-81,81-82
            50-88,51-51
            87-87,9-86
            6-91,3-5
            10-83,3-82
            99-99,9-95
            68-69,68-68
            42-42,36-43
            28-58,27-58
            3-85,1-85
            8-88,8-89
            11-86,12-93
            21-60,1-99
            6-96,3-7
            73-91,83-85
            98-98,11-99
            31-69,28-70
            89-91,57-90
            5-95,10-94
            48-50,3-49
            12-76,10-13
            2-60,2-25
            2-33,34-72
            14-19,18-18
            34-86,35-87
            20-92,97-99
            11-83,83-84
            17-80,16-79
            96-99,4-97
            15-92,16-92
            24-99,81-97
            7-92,93-99
            24-80,25-90
            71-88,87-94
            6-64,32-69
            34-48,46-67
            13-14,14-63
            26-47,26-46
            18-33,18-33
            96-97,5-95
            49-93,48-94
            52-79,58-58
            2-62,3-63
            8-80,9-71
            41-75,32-40
            53-96,71-71
            85-85,84-84
            63-76,59-77
            58-76,59-75
            4-19,18-19
            1-98,3-99
            22-90,22-68
            9-96,97-97
            11-75,12-76
            9-45,9-46
            20-83,20-84
            8-83,5-84
            74-96,92-92
            3-95,4-95
            19-30,19-29
            71-81,8-71
            10-98,11-95
            3-90,4-90
            7-18,18-36
            9-21,4-21
            1-52,3-52
            21-61,21-61
            2-99,21-24
            31-92,58-97
            4-71,4-71
            16-40,17-64
            43-85,44-86
            4-62,61-62
            3-91,4-90
            64-64,35-63
            6-78,5-5
            59-71,33-72
            56-60,55-61
            3-76,1-77
            30-32,31-31
            23-78,25-69
            9-99,4-10
            19-85,9-88
            4-97,3-3
            75-96,74-96
            97-98,96-96
            10-97,10-98
            85-85,85-85
            4-49,4-48
            17-97,14-97
            4-4,3-89
            34-64,15-34
            19-83,19-19
            24-70,23-69
            18-40,17-62
            19-79,18-19
            30-82,30-58
            5-8,7-28
            2-8,4-85
            4-4,3-85
            10-41,11-40
            86-89,69-85
            44-71,71-84
            51-79,51-97
            20-97,64-97
            2-23,2-23
            8-29,22-28
            81-97,57-68
            69-84,68-84
            2-98,2-90
            23-42,29-56
            11-89,11-88
            14-72,10-79
            46-75,74-74
            52-54,48-53
            12-80,19-80
            4-62,3-62
            3-4,3-87
            1-2,4-84
            3-43,3-44
            56-94,94-94
            14-49,15-49
            54-58,55-58
            1-96,2-62
            32-70,17-70
            23-86,23-85
            5-97,2-96
            46-72,47-71
            90-90,25-90
            30-54,53-54
            4-88,34-45
            27-92,28-92
            38-39,38-85
            8-46,7-28
            5-66,5-67
            7-98,7-56
            39-85,39-86
            17-64,17-65
            50-88,49-88
            4-49,4-79
            14-72,14-71
            62-79,63-83
            2-75,2-21
            8-83,8-15
            72-94,77-77
            63-98,63-98
            52-56,52-70
            4-77,3-4
            73-81,73-73
            6-91,7-37
            33-86,2-80
            19-22,18-18
            2-98,4-77
            18-63,13-17
            29-40,30-41
            5-98,20-92
            24-78,20-23
            5-34,5-35
            97-99,15-98
            4-69,5-68
            74-76,63-76
            23-97,96-97
            7-94,7-93
            18-24,18-24
            28-45,45-45
            14-63,48-55
            10-69,10-68
            78-80,47-79
            33-72,32-32
            68-90,68-69
            52-58,59-72
            18-26,8-44
            11-96,6-97
            52-98,52-99
            64-96,63-82
            24-90,77-90
            2-73,82-85
            70-79,68-90
            8-74,13-75
            1-25,3-24
            1-94,6-52
            34-92,31-96
            36-78,35-79
            2-64,1-65
            41-90,20-91
            68-70,3-71
            51-53,51-59
            10-13,14-88
            33-95,33-94
            71-98,70-96
            1-93,4-88
            8-62,5-61
            39-90,40-91
            89-89,32-90
            1-11,1-10
            6-63,6-62
            22-85,11-51
            9-9,8-95
            9-79,9-73
            9-91,9-34
            62-85,20-61
            73-87,73-86
            15-45,17-45
            16-94,16-95
            1-18,4-57
            28-45,44-45
            14-62,13-61
            8-36,3-8
            12-50,44-49
            47-62,47-61
            16-78,15-64
            44-45,45-51
            3-25,6-26
            47-70,46-71
            28-83,13-84
            1-99,2-98
            19-76,19-77
            35-58,25-57
            4-63,1-3
            98-99,3-99
            28-89,89-90
            64-86,13-86
            66-89,42-67
            22-71,8-88
            91-94,1-92
            72-92,73-91
            13-28,13-65
            28-99,28-97
            59-81,59-80
            57-93,92-92
            71-98,71-81
            2-4,3-53
            20-65,30-65
            11-75,76-85
            1-90,1-89
            2-25,24-24
            64-91,63-93
            15-97,7-16
            33-64,42-63
            77-81,6-98
            7-91,8-92
            2-48,2-48
            63-65,32-64
            23-95,23-95
            41-41,52-94
            10-26,10-80
            99-99,2-57
            37-66,25-37
            17-81,18-81
            76-93,92-92
            58-89,9-59
            31-31,30-87
            46-85,84-86
            3-4,5-99
            37-95,37-40
            3-75,3-93
            44-86,42-44
            4-50,49-50
            20-43,19-43
            83-91,82-97
            39-39,38-77
            1-94,1-95
            53-74,30-54
            25-69,25-68
            3-85,85-85
            37-69,4-68
            57-84,53-57
            57-95,20-99
            9-85,9-84
            25-79,26-26
            5-99,3-98
            58-86,57-85
            3-24,4-59
            6-93,7-93
            74-96,75-96
            92-98,12-92
            55-62,49-56
            1-73,1-99
            8-99,98-99
            12-72,12-71
            52-72,71-71
            63-97,63-96
            21-99,20-21""";
    // endregion inputs

    @Test
    void shouldFindAllOverlappingPairs() {
        Camp camp = new Camp(shortInput);
        assertEquals(4, camp.findOverlappingPairs());
    }

    @Test
    void shouldFindAllOverlappingPairsForLongInput() {
        Camp camp = new Camp(longInput);
        assertEquals(891, camp.findOverlappingPairs());
    }
}
