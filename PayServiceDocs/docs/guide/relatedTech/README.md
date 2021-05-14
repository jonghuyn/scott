# Tmax Payment System Guide

> Tmax Payment 시스템 문서 작성을 위한 프로젝트입니다.

> 가이드는 [VuePress](https://vuepress.vuejs.org/) 을 기반하고 있으며, `Markdown` 으로 가이드를 작성합니다.  
> 작성에 대한 규칙이나 방법은 (https://vuepress.vuejs.org/guide/) 을 통해 참고할 수 있습니다.

## Development

- yarn 명령어 실행
```bash
yarn
```

- 로컬 서버(http://localhost:8080/docs/) 실행 (hot-reloading)
```bash
yarn dev
```

- 정적 사이트(html)로 빌드
```bash
yarn build
```

## Directory Structure

```bash
.
├── dist (실제 배포되는 HTML. 'yarn build' 명령어를 통해 생성됨)
|
├── docs
│   ├── .vuepress (환경 설정 및 정적 리소스를 저장)
|   │    ├── public/resources    (사진이나 동영상 등의 리소스)
|   |    ├── styles              (스타일 설정)
|   │    └── config.js           (환경 및 라우팅 설정)
|   |
│   ├── api (api 가이드)
│   ├── en  (영문 가이드)
│   ├── guide (시스템 가이드)
│   └── README.md (Home page 설정)
|
└── README.md
```
