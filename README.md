# Decoration

[![](https://jitpack.io/v/ShortStickBoy/Decoration.svg)](https://jitpack.io/#ShortStickBoy/Decoration)
[![](https://img.shields.io/badge/License-Apache%202.0-orange.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

A tool to help the RecyclerView's item add horizontal and vertical space.

### ScreenShot
<a href="screenshot/Demo1.png"><img src="screenshot/Demo1.png"/></a>  <a href="screenshot/Demo2.png"><img src="screenshot/Demo2.png"/></a>

### Gradle
```groovy
dependencies {
    implementation 'com.github.ShortStickBoy:Decoration:V1.0.0'
}
```

### Use
```groovy
recyclerView.addItemDecoration(new LineDecoration(spacing));
recyclerView.addItemDecoration(new LineDecoration(hSpacing, vSpacing));
recyclerView.addItemDecoration(new GridDecoration(spanCount, spacing, includeEdge));
recyclerView.addItemDecoration(new GridDecoration(spanCount, hSpacing, vSpacing, includeEdge));
```

### License
```
Copyright [2018] sunzn

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```