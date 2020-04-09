package com.hackweek.story.Bean;

import com.alibaba.fastjson.JSONArray;

import java.util.Map;

public class ResultJson {
        private int id;
        private String name;
        private String description;
        private Map<String, JSONArray> map;
        //private JSONArray options;

        public int getId() { return id; }

        public void setId(int id) { this.id = id; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }

        public void setDescription(String description) { this.description = description; }

        public Map<String, JSONArray> getMap() { return map; }

        public void setMap(Map<String, JSONArray> map) { this.map = map; }

        //public JSONArray getOptions() { return options; }

        //public void setOptions(JSONArray options) { this.options = options; }
}
