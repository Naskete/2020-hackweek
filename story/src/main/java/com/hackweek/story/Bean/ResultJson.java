package com.hackweek.story.Bean;

import com.alibaba.fastjson.JSONArray;

public class ResultJson {
        //返回json数据集合

        //id，对应event中的id
        private int id;
        //name，对应event中的name
        private String name;
        //descrption对应event中的description
        private String description;
        //options对应event中的options
        private JSONArray options;

        public int getId() { return id; }

        public void setId(int id) { this.id = id; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }

        public void setDescription(String description) { this.description = description; }

        public JSONArray getOptions() { return options; }

        public void setOptions(JSONArray options) { this.options = options; }
}
