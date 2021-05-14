module.exports = {
    head: [
        ['link', { rel: 'icon', href: '/logo.png' }],
        ['meta', { name: 'theme-color', content: '#3eaf7c' }],
        ['meta', { name: 'apple-mobile-web-app-capable', content: 'yes' }],
        ['meta', { name: 'apple-mobile-web-app-status-bar-style', content: 'black' }]
    ],
    base: '/docs/',
    dest: 'dist',
    locales: {
        '/': {
            lang: 'ko-KR',
            title: 'Tmax Payment System',
            description: 'TPay System Documentation'
        },
        '/en/': {
            lang: 'en-US',
            title: 'Tmax Payment System',
            description: 'TPay System Documentation'
        }
    },
    themeConfig: {
        logo: '/logo.png',
        repo: '',
        docsDir: 'docs',
        editLinks: false,
        prevLinks: true,
        nextLinks: true,
        locales: {
            '/': {
                selectText: 'KR',
                label: 'Korean',
                ariaLabel: 'Languages',
                nav: [
                    { text: 'User Guide', link: '/guide/' },
                    { text: 'API Reference', link: '/api/' }
                ],
                sidebar: {
                    '/guide/': getKrGuideSidebar('소개', '관련기술', 'Service Description'),
                    '/api/': getKrApiSidebar('Service API')
                }
            },
            '/en/': {
                selectText: 'EN',
                label: 'English',
                nav: [
                    { text: 'Guide', link: '/en/guide/introduction' }
                ],
                sidebar: {
                    '/': [
                        {
                            title: 'Tmax Payment System Introduction',
                            collapsable: false,
                            children: [
                                '/en/guide/introduction',
                            ]
                        }
                    ]
                }
            }
        }
    },
    plugins: [
        '@vuepress/plugin-back-to-top',
        '@vuepress/plugin-medium-zoom',
    ]
}

function getKrGuideSidebar(groupA, groupB, groupC) {
    return [
        {
            title: groupA,
            collapsable: false,
            children: [
                '/guide/',
                'introduction/architecture'
            ]
        },
        {
            title: groupB,
            collapsable: false,
            children: [
                'relatedTech/kafka/apacheKafka'
            ]
        },
        {
            title: groupC,
            collapsable: false,
            children: [
                'description/service-overview',
                'description/order-service'
            ]
        }
    ]
}

function getKrApiSidebar(groupA, groupB) {
    return [
        {
            title: groupA,
            path: '/api/',
            collapsable: false,
            children: [
                '/api/'
            ]
        }
    ]
}
