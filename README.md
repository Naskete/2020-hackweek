### 开始

URL:http://121.199.32.101:8088/start

请求方式：GET

返回值类似：json

返回示例：

```json
{
    "health": 100,
    "energy": 100,
    "mood": 100,
    "mask": 20,
    "money": 5000
}
```



## 各地点事件触发

### House

URL:http://121.199.32.101:8088/house

请求方式：GET

返回值类似：json

返回示例:

```json
[
    {
        "id": 1,
        "name": "开始",
        "description": "开始",
        "options": [
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 0,
                "name": "开始"
            },
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 0,
                "name": "开始"
            }
        ]
    },
    ...
]
```

### Supermarket

URL:http://121.199.32.101:8088/supermarket

请求方式：GET

返回值类似：json

返回示例：

```json
[
    {
        "id": 8,
        "name": "事件",
        "description": "描述",
        "options": [
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 0,
                "name": "选择"
            },
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 0,
                "name": "选择"
            }
        ]
    },
    ...
]
```



### Gate

URL:http://121.199.32.101:8088/gate

请求方式：GET

返回值类似：json

返回示例：

```json
[
    {
        "id": 21,
        "name": "事件",
        "description": "描述",
        "options": [
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 0,
                "name": "选项"
            },
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 1,
                "name": "选项"
            }
        ]
    },
    ...
]
```



### Hospital

URL:http://121.199.32.101:8088/hospital

请求方式：GET

返回值类似：json

返回示例：

```json
[
    {
        "id": 32,
        "name": "事件",
        "description": "描述",
        "options": [
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 0,
                "name": "选项"
            },
            {
                "result": {
                    "mood": -10,
                    "money": -10,
                    "health": -10,
                    "mask": -1,
                    "energy": 10
                },
                "flag": 1,
                "name": "选项"
            }
        ]
    },
    ...
]
```



### game over

URL:http://121.199.32.101:8088/gameover

请求方式：GET

返回值类似：json

返回示例：

```json
[
    {
        "id": 29,
        "name": "game over",
        "description": "在家咸鱼了很久终于等到疫情过去，春天到来，一年之计在于此，你也该重新寻找自己的方向",
        "options": []
    },
    ...
]
```

